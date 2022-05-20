package Starter.StepDefinitions;

import Starter.Pages.HomePage;
import Starter.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TransaksiStep {
    @Steps
    HomePage homePage;

    @Steps
    LoginPage loginPage;


    @Given("I am on the login pagess")
    public void iAmOnTheLoginxPagess() {
        loginPage.openUrl("https://qa.alta.id/auth/login");
        loginPage.validateOnLoginPage();
    }

    @When("I inputd {string} email with {string} password")
    public void iInputdEmail(String email,String password) {
        loginPage.inputEmail(email);
        loginPage.inputPassword(password);
    }

    @And("I inputd {string} password")
    public void iInputdPassword(String password) {
        loginPage.inputPassword(password);
    }

    @And("clickd login button")
    public void clickLogindButton() {
        loginPage.clickLoginButton();
    }
    @And("clickd buy button")
    public void iClickBuyButton() {homePage.clickBuyButton();}
    @And("clickd cart button")
    public void iClickCartButton() {homePage.clickCartButton();}
    @And("click paid button")
    public void iClickPaidButton() {homePage.clickPaidButton();}
    @Then("I validate to transactions page")
    public void iValidateToTransactionsPage(){
        homePage.clickProfileButton();
        homePage.clickTransButton();
    }
}
