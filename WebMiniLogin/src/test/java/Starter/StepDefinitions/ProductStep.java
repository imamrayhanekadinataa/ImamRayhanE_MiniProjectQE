package Starter.StepDefinitions;

import Starter.Pages.HomePage;
import Starter.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ProductStep {
    @Steps
    HomePage homePage;

    @Steps
    LoginPage loginPage;

    @Given("I am on the login pagesx")
    public void iAmOnTheLoginxPages() {
        loginPage.openUrl("https://qa.alta.id/auth/login");
        loginPage.validateOnLoginPage();
    }

    @When("I inputx {string} email")
    public void iInputxEmail(String email) {
        loginPage.inputEmail(email);
    }

    @And("I inputx {string} password")
    public void iInputxPassword(String password) {
        loginPage.inputPassword(password);
    }

    @And("clickx login button")
    public void clickLoginxButton() {
        loginPage.clickLoginButton();
    }

    @And("click buy button")
    public void iClickBuyButton() {
        homePage.clickBuyButton();
    }

    @And("I validate in cart shop")
    public void iClickCartButton() {
        homePage.clickCartButton();
    }

}
