package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;
    private By cookieAgree = By.xpath("//button[@id='cookie-agree']");
    private By paymentMenu = By.xpath("//button[@class='select__header']");
    private By servicesTab = By.xpath("//p[@class='select__option' and text()='Услуги связи']");
    private By internetTab = By.xpath("//p[@class='select__option' and text()='Домашний интернет']");
    private By instalmentTab = By.xpath("//p[@class='select__option' and text()='Рассрочка']");
    private By arrearsTab = By.xpath("//p[@class='select__option' and text()='Задолженность']");
    //Локаторы "Услуги связи"
    private By phoneInput = By.xpath("//input[@id='connection-phone']");
    private By sumInput = By.xpath("//input[@id='connection-sum']");
    //Локаторы "Домашний интернет"
    private By subscriberNumberField = By.xpath("//input[@id='internet-phone']");
    private By internetSum = By.xpath("//input[@id='internet-sum']");
    //Локаторы "Рассрочка"
    private By scoreInstalment = By.xpath("//input[@id='score-instalment']");
    private By sumInstalment = By.xpath("//input[@id='instalment-sum']");
    //Локаторы "Задолженность"
    private By scoreArrears = By.xpath("//input[@id='score-arrears']");
    private By sumArrears = By.xpath("//input[@id='arrears-sum']");
    private By continueButton = By.xpath("//button[@type='submit' and contains(text(), 'Продолжить')]");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    //Принимаем куки
    public void acceptCookie() {
        driver.findElement(cookieAgree).click();
    }

    //Выбираем "Услуги связи"
    public void selectServices() {
        driver.findElement(paymentMenu).click();
        driver.findElement(servicesTab).click();
    }

    //Выбираем "Интернет"
    public void selectInternet() {
        driver.findElement(paymentMenu).click();
        driver.findElement(internetTab).click();
    }

    //Выбираем "Рассрочка"
    public void selectInstalment() {
        driver.findElement(paymentMenu).click();
        driver.findElement(instalmentTab).click();
    }

    //Выбираем "Задолженность"
    public void selectArrears() {
        driver.findElement(paymentMenu).click();
        driver.findElement(arrearsTab).click();
    }

    private String getElementPlaceholder(By locator) {
        return driver.findElement(locator).getAttribute("placeholder");
    }

    public String getServicesPhonePlaceholder() {
        return getElementPlaceholder(phoneInput);
    }

    public String getInternetPhonePlaceholder() {
        return getElementPlaceholder(subscriberNumberField);
    }

    public String getScoreInstalmentPlaceholder() {
        return getElementPlaceholder(scoreInstalment);
    }

    public String getScoreArrearsPlaceholder() {
        return getElementPlaceholder(scoreArrears);
    }

    public String getServicesSumPlaceholder() {
        return getElementPlaceholder(sumInput);
    }

    public String getInternetSumPlaceholder() {
        return getElementPlaceholder(internetSum);
    }

    public String getInstalmentSumPlaceholder() {
        return getElementPlaceholder(sumInstalment);
    }

    public String getArrearsSumPlaceholder() {
        return getElementPlaceholder(sumArrears);
    }

    public void fillServicesPlaces(String phone, String sum) {
        driver.findElement(phoneInput).sendKeys(phone);
        driver.findElement(sumInput).sendKeys(sum);
        driver.findElement(continueButton).click();
    }
}
