package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentFrame {
    private WebDriver driver;
    private By headerSum = By.xpath("//div[@class='pay-description__cost']//span");
    private By paymentInfo = By.xpath("//span[contains(text(), 'Оплата: Услуги связи')]");
    private By buttonSum = By.xpath("//button[contains(@class, 'colored')]//span[contains(text(), 'Оплатить')]");
    private By cardNumberLabel = By.xpath("//label[text()='Номер карты']");
    private By expiryDateLabel = By.xpath("//label[text()='Срок действия']");
    private By cvcCodeLabel = By.xpath("//label[text()='CVC']");
    private By cardNameLabel = By.xpath("//label[text()='Имя и фамилия на карте']");
    private By paymentIcons = By.xpath("//div[contains(@class, 'cards-brands')]//img");

    public PaymentFrame(WebDriver driver) {
        this.driver = driver;
    }

    private String getElementText(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(driver -> {
            String text = driver.findElement(locator).getText();
            return (text != null && !text.isEmpty()) ? text : null;
        });
    }

    public String getHeaderSumText() {
        return getElementText(headerSum);
    }

    public String getPaymentInfoText() {
        return getElementText(paymentInfo);
    }

    public String getButtonSumText() {
        return getElementText(buttonSum);
    }

    public String getCardNumberPlaceholder() {
        return getElementText(cardNumberLabel);
    }

    public String getExpiryDatePlaceholder() {
        return getElementText(expiryDateLabel);
    }

    public String getCvcPlaceholder() {
        return getElementText(cvcCodeLabel);
    }

    public String getCardNamePlaceholder() {
        return getElementText(cardNameLabel);
    }

    public int getIconsCount() {
        return driver.findElements(paymentIcons).size();
    }
}
