package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import PageObjects.LoginPage;

public class Login {

    WebDriver driver;
    LoginPage loginObj;

    @Given("user is navigated to login page with {string}")
    public void user_is_navigated_to_login_page_with(String url) {

        driver = WebDriverManager.chromiumdriver().create();
        loginObj = new LoginPage(driver);
        driver.get(url);


    }

    @When("user click on submit with {string} and {string}")
    public void user_click_on_submit_with_and(String Uname, String Pwd) {
        loginObj.setUsername(Uname);
        loginObj.setPassword(Pwd);
        loginObj.clickLogin();

    }


    @Then("user should be logged in successfully without any errors")
    public void user_should_be_logged_in_successfully_without_any_errors() {
        loginObj.verifySuccessfulLogin();
    }
}
