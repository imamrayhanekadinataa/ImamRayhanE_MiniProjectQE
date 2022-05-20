package Starter.StepDefinitions;

import Starter.Pages.RegisterPage;
import Starter.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegisterStep {
    @Steps
    RegisterPage registerPage;

    @Steps
    LoginPage loginPage;

    @Given("I am on the register page")
    public void iAmOnTheRegisterPage() {
        registerPage.openUrl("https://qa.alta.id/auth/register");
        registerPage.validateOnRegisterPage();
    }

    @When("I input {string} namalengkap")
    public void iInputnamalengkap(String namalengkap) {
        registerPage.inputnamalengkap(namalengkap);
    }

    @And("I input {string} emails")
    public void iInputEmails(String emails) {
        registerPage.inputemail(emails);
    }

    @And("I input {string} Password")
    public void iInputPassword(String Password) {
        registerPage.inputPassword(Password);
    }

    @And("click register button")
    public void clickRegisterButton() { registerPage.clickRegisterButton(); }

    @Then("I get {string}")
    public void iGet(String Output) {
        if (Output.equals("login page")){
            loginPage.headerAppears();
            loginPage.headerTextEqual();
        }else {
            registerPage.errorMessageAppears();
            registerPage.errorMessageEquals(Output);
        }
    }
}
