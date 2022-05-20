package Starter.StepDefinitions;

import Starter.Pages.RegisterPage;
import Utils.General;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegisterStep {
    public String Email;

    @Steps
    RegisterPage registerPage;

    @Given("I set an endpoint for register user")
    public void iSetAnEndpointForRegisterUser() {
        registerPage.setEndpointRegister();
    }
    @When("I input {string} with {string} with {string}")
    public void iInputNullField(String fullname, String email, String password) {
        registerPage.inputNullField(fullname, email, password);
    }

    @And("I request detail account user")
    public void iRequestDetailEmail() {
        this.Email = registerPage.getEmailUser();
    }

    @Then("I validate status code is {int}")
    public void iValidateStatusCodeIsStatuscode(int arg0) {
        registerPage.validateStatuscode(arg0);
    }



}

