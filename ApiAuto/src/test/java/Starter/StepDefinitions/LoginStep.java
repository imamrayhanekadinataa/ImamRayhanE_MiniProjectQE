package Starter.StepDefinitions;

import Starter.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStep {
    public String email;

    @Steps
    LoginPage loginPage;

    @Given("I set an endpoint for login user")
    public void iSetAnEndpointForLoginUser() {
        loginPage.getEndpointLogin();
    }
    @And("I input {string} with {string}")
    public void iInputField(String email, String password) {
        loginPage.inputField(email, password);
    }

    @When("I request detail account email user")
    public void iRequestDetailEmail() {
        this.email = loginPage.getEmailUser();
    }

    @Then("validate status code is {int}")
    public void validateStatusCodeIsStatus_code(int arg0) {
        loginPage.validateStatusCode(arg0);
    }

    @And("validate the {string} after request login")
    public void validateTheAfterRequestLogin(String message) {
        loginPage.validateDataDetail(message);
    }

    @And("get token if {string} for other request")
    public void getTokenIfForOtherRequest(String message) {
        if (message.equals("success")){
            loginPage.getBearerToken();
        }
    }
}

