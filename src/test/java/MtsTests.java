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
import pages.MainPage;
import pages.PaymentFrame;

import java.time.Duration;

public class MtsTests {
    private WebDriver driver;
    private MainPage mainPage;
    private PaymentFrame paymentFrame;

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.chrome.silentOutput", "true");
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(java.util.logging.Level.OFF);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.mts.by");
        mainPage = new MainPage(driver);
        paymentFrame = new PaymentFrame(driver);
        mainPage.acceptCookie();
    }

    @Test
    void testServicesPlaceholder() {
        mainPage.selectServices();
        String phone = mainPage.getServicesPhonePlaceholder();
        String sum = mainPage.getServicesSumPlaceholder();
        Assertions.assertEquals(phone, "Номер телефона");
        Assertions.assertEquals(sum, "Сумма");
    }

    @Test
    void testInternetPlaceholder() {
        mainPage.selectInternet();
        String subscriberNumberField = mainPage.getInternetPhonePlaceholder();
        String sum = mainPage.getInternetSumPlaceholder();
        Assertions.assertEquals(subscriberNumberField, "Номер абонента");
        Assertions.assertEquals(sum, "Сумма");
    }

    @Test
    void testInstalmentPlaceholder() {
        mainPage.selectInstalment();
        String score = mainPage.getScoreInstalmentPlaceholder();
        String sum = mainPage.getInstalmentSumPlaceholder();
        Assertions.assertEquals(score, "Номер счета на 44");
        Assertions.assertEquals(sum, "Сумма");
    }

    @Test
    void testArrearsPlaceholder() {
        mainPage.selectArrears();
        String score = mainPage.getScoreArrearsPlaceholder();
        String sum = mainPage.getArrearsSumPlaceholder();
        Assertions.assertEquals(score, "Номер счета на 2073");
        Assertions.assertEquals(sum, "Сумма");
    }

    @Test
    void testPaymentFrame() {
        mainPage.selectServices();
        mainPage.fillServicesPlaces("297777777", "50");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("payment-widget-iframe")));
        String headerSum = paymentFrame.getHeaderSumText();
        Assertions.assertTrue(headerSum.contains("50"), "Ожидали 50 в хедере, получили: " + headerSum);
        String headerPhone = paymentFrame.getPaymentInfoText();
        Assertions.assertTrue(headerPhone.contains("297777777"), "Номер не найден в инфо: " + headerPhone);
        String buttonSum = paymentFrame.getButtonSumText();
        Assertions.assertTrue(buttonSum.contains("50"), "Сумма на кнопке не совпала: " + buttonSum);
        String cardNumber = paymentFrame.getCardNumberPlaceholder();
        Assertions.assertEquals(cardNumber, "Номер карты");
        String dateLabel = paymentFrame.getExpiryDatePlaceholder();
        Assertions.assertEquals(dateLabel, "Срок действия");
        String cvcCode = paymentFrame.getCvcPlaceholder();
        Assertions.assertEquals(cvcCode, "CVC");
        String cardName = paymentFrame.getCardNamePlaceholder();
        Assertions.assertEquals(cardName, "Имя и фамилия на карте");
        int iconsCount = paymentFrame.getIconsCount();
        Assertions.assertTrue(iconsCount >= 4,
                "Ожидалось минимум 4 иконки, найдено: " + iconsCount);
        driver.switchTo().defaultContent();
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
