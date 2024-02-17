package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {


    @Given("user is navigated to login page with url {string}")
    public void userIsNavigatedToLoginPageWithUrl(String url) {
        System.out.println("Navigated to Guru99 URL");
    }


    @And("user is logged into guru portal with userName and password")
    public void userIsLoggedIntoGuruPortalWithUserNameAndPassword() {
        System.out.println("Logged Into Guru99 portal");
    }

    @When("user enters customerId as {string} and tab off")
    public void user_enters_customer_id_as_and_tab_off(String value) {
        System.out.println("User entered value & tabbed off");
    }

    @Then("error message should be displayed and it should be {string}")
    public void error_message_should_be_displayed_and_it_should_be(String errorMsg) {
        System.out.println("Error message displayed " + errorMsg);
    }

}
