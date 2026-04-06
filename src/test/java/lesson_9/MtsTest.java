package lesson_9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MtsTest {
    private WebDriver driver;

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.chrome.silentOutput", "true");
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(java.util.logging.Level.OFF);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.mts.by");
        WebElement cookieButton = driver.findElement(By.xpath("//button[@id='cookie-agree']"));
        cookieButton.click();
    }

    @Test
    void findTitlePayment() {
        WebElement titlePayment = driver.findElement(By.xpath("//h2[contains(text(), 'Онлайн пополнение')]"));
        String actualTitle = titlePayment.getText().replace("\n", " ");
        System.out.println("Заголовок блока: " + titlePayment.getText());
        Assertions.assertEquals("Онлайн пополнение без комиссии", actualTitle, "Заголовок не совпадает!");
    }

    @Test
    void findLogoPayment() {
        List<WebElement> logos = driver.findElements(By.xpath("//div[@class='pay__partners']//img"));
        System.out.println("Найдено логотипов: " + logos.size());
        Assertions.assertFalse(logos.isEmpty(), "Логотипы платёжных систем не найдены");
        for (WebElement logo : logos) {
            Assertions.assertTrue(logo.isDisplayed(), "Один из логотипов не отображается");
        }
    }

    @Test
    void testMoreDetailsLink() {
        WebElement moreDetailsLink = driver.findElement(By.xpath("//a[text()='Подробнее о сервисе']"));
        moreDetailsLink.click();
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Переход на страницу: " + currentUrl);
        Assertions.assertTrue(currentUrl.contains("poryadok-oplaty"), "URL не соответствует ожидаемому!");
    }

    @Test
    void paymentFilling() {
        String inputPhone = "297777777";
        String inputSum = "50";
        driver.findElement(By.xpath("//button[@class='select__header']")).click();
        driver.findElement(By.xpath("//p[@class='select__option' and text()='Услуги связи']")).click();
        WebElement phoneInput = driver.findElement(By.xpath("//input[@id='connection-phone']"));
        phoneInput.click();
        phoneInput.sendKeys(inputPhone);
        WebElement sumInput = driver.findElement(By.xpath("//input[@id='connection-sum']"));
        sumInput.click();
        sumInput.sendKeys(inputSum);
        driver.findElement(By.xpath("//button[@type='submit' and contains(text(), 'Продолжить')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[contains(@src, 'bepaid')]")));
        WebElement finalSumElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[contains(@class, 'pay-description__cost')]//span")
        ));
        String actualSumText = finalSumElement.getText();
        System.out.println("Текст в окне оплаты: " + actualSumText);
        Assertions.assertTrue(actualSumText.contains(inputSum),
                "Ошибка! Сумма в окне (" + actualSumText + ") не содержит ожидаемую: " + inputSum);
        WebElement phoneDetail = driver.findElement(By.xpath("//div[@class='pay-description__text']//span"));
        Assertions.assertTrue(phoneDetail.getText().contains(inputPhone),
                "Номер телефона в чеке не совпадает! Ожидали: " + inputPhone);
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
