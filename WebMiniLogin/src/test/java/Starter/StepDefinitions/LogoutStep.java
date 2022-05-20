package Starter.StepDefinitions;

import Starter.Pages.HomePage;
import Starter.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LogoutStep {
@Steps
    HomePage homePage;

@Steps
    LoginPage loginPage;

    @Given("I am on the login pages")
    public void iAmOnTheLoginsPages() {
        loginPage.openUrl("https://qa.alta.id/auth/login");
        loginPage.validateOnLoginPage();
    }

    @When("I inputs {string} email")
    public void iInputsEmail(String email) {
        loginPage.inputEmail(email);
    }

    @And("I inputs {string} password")
    public void iInputsPassword(String password) {
        loginPage.inputPassword(password);
    }

    @And("clicks login button")
    public void clickLoginnButton() {
        loginPage.clickLoginButton();
    }
    @And("I get to home page")
    public void iGetToHomePage(){
        homePage.headerTextEqual();
    }

    @And("click profile button")
    public void iClickProfileButton() {homePage.clickProfileButton();}

    @And("click logout button")
    public void iClickLogoutButton() {homePage.clickLogoutButton();}

    @Then("I validate back to login page")
    public void iValidateBackToLoginPage(){
        loginPage.validateOnLoginPage();}
}
