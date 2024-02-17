package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

    @Given("user is navigated to login page with url {string}")
    public void userIsNavigatedToLoginPageWithUrl(String url) {
        System.out.println("Navigated to Guru99 URL");
    }

    @Given("user is logged into guru99 portal with userName {string} password {string}")
    public void user_is_logged_into_guru99_portal_with_user_name_password(String username, String password) {
        System.out.println("User is on guru99 Home Page");
    }

    @When("user enters customerId as {string} and tab off")
    public void user_enters_customer_id_as_and_tab_off(String value) {
        System.out.println("User entered value & tabbed off");
    }

    @Then("error message should be displayed and it should be {string}")
    public void error_message_should_be_displayed_and_it_should_be(String errorMsg) {
        System.out.println("Error message displayed "+errorMsg);
    }


}
