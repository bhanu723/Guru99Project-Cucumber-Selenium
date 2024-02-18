package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By Username = By.name("uid");
    By Password = By.name("password");
    By LoginBtn = By.name("btnLogin");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String uName) {
        driver.findElement(Username).sendKeys(uName);
    }

    public void setPassword(String pwd) {
        driver.findElement(Password).sendKeys(pwd);
    }

    public void clickLogin() {
        driver.findElement(LoginBtn).click();
    }

}
