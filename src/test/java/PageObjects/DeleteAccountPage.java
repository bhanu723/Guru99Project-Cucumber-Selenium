package PageObjects;

import com.google.gson.internal.bind.util.ISO8601Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class DeleteAccountPage {

    WebDriver driver;

    // All Elements in Delete Account page

    By DeleteAccLink = By.linkText("Delete Account");
    By AccountNoTxt = By.xpath("//input[@name='accountno']");
    By SubmitBtn = By.name("AccSubmit");
    By ResetBtn = By.name("res");
    By ErrorMsg = By.id("message2"); //Reading Error Message
    By ConnectionError = By.xpath("//body/text()");
    By marqueeMsg = By.xpath("//tbody//tr[2]//marquee");

    public DeleteAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    // Setters & Getters

    public void setAccountNo(String value) {
        driver.findElement(AccountNoTxt).sendKeys(value);
    }

    public String getErrorMessage() {
        return driver.findElement(ErrorMsg).getText();
    }

    public void clickSubmitButton() {
        driver.findElement(SubmitBtn).click();
    }

    public void tabOffAccountNo() {
        driver.findElement(AccountNoTxt).sendKeys(Keys.TAB);
    }

    public void clickDeleteAccLink() {
        driver.findElement(DeleteAccLink).click();
    }

    public boolean isMessagePresent() {
        return driver.findElement(marqueeMsg).isDisplayed();
    }

    public boolean isConnectionErrorElementPresent() {
        try {
            if (driver.findElement(ConnectionError).isDisplayed()) ;
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public String getConnectionErrorMsg() {
        return driver.findElement(ConnectionError).getText();
    }

}
