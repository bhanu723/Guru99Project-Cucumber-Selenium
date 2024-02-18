package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import PageObjects.*;

import java.time.Duration;

public class DeleteAccStepDefinitions {

    WebDriver driver;
    ChromeOptions opt;
    DeleteAccountPage deleteAccObj;
    LoginPage loginObj;

    @Given("user is navigated to login page with url {string}")
    public void userIsNavigatedToLoginPageWithUrl(String url) {
        opt = new ChromeOptions();
        opt.addArguments("start-maximized");
        opt.setImplicitWaitTimeout(Duration.ofSeconds(5));
//        opt.addArguments("--headless");

        driver = WebDriverManager.chromedriver().capabilities(opt).create();
        deleteAccObj = new DeleteAccountPage(driver);
        loginObj = new LoginPage(driver);

        driver.get(url);
    }

    @And("user is logged into guru portal with userName and password")
    public void userIsLoggedIntoGuruPortalWithUserNameAndPassword() {

        try {
            loginObj.setUsername("mngr552704");
            loginObj.setPassword("dapYbyj");
            loginObj.clickLogin();
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Exception Occurred during Guru99 Login =>" + e);
        }

    }


    @When("user enters Invalid AccountNo as {string} and tab off")
    public void userEntersInvalidAccountNoAsAndTabOff(String value) {
        try {
            Assert.assertTrue(deleteAccObj.isMessagePresent());

            deleteAccObj.clickDeleteAccLink();
            deleteAccObj.setAccountNo(value);
            deleteAccObj.tabOffAccountNo();
        } catch (Exception e) {
            throw new AssertionError("Exception Occurred when Entering Clicking DeleteAcclink/AccountNo/Tagging =>" + e);
//            e.printStackTrace();
        }

    }


    @Then("error message should be displayed and it should be {string}")
    public void error_message_should_be_displayed_and_it_should_be(String expected_error) {
        try {
            String actual_error = deleteAccObj.getErrorMessage();
            System.out.println("Actual Error is: " + actual_error);

            Assert.assertEquals(actual_error, expected_error);

        } catch (Exception e) {
            throw new AssertionError("Exception Occurred during Error validation =>"+e);

        } finally {
            driver.close();
            driver.quit();
        }

    }

    @Then("user is successfully navigated to redirect page without any errors")
    public void userIsSuccessfullyNavigatedToRedirectPageWithoutAnyErrors() {
        System.out.println("Login is successful");
    }


}
