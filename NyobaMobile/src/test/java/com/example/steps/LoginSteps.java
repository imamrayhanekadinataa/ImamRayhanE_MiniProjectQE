package com.example.steps;

import com.example.app.pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    loginPage loginpage = new loginPage();

    @Given("I am on alta shop application")
    public void iAmOnAltaShopApplication() {
        loginpage.logoutButtonDisplayed();
    }

    @When("I click logout button on product page")
    public void iClickLogoutButtonOnProductPage() {
        loginpage.clickLogoutButton();
    }

    @And("I go to login page")
    public void iGoToLoginPage() {
        loginpage.loginButtonDisplayed();
    }

    @And("I input {string}")
    public void iInput(String email) throws Exception {
        Thread.sleep(1000);
        loginpage.clickEmailField();
        loginpage.inputEmail(email);
    }

    @And("Input {string}")
    public void input(String password) throws Exception {
        Thread.sleep(1000);
        loginpage.clickPasswordField();
        loginpage.inputPassword(password);
    }

    @And("I Click login button")
    public void iClickLoginButton() {
        loginpage.clickLoginButton();
    }

    @Then("I get the {string}")
    public void iGetThe(String result) {
        if (result.equals("product_page")){
            loginpage.productLabelDisplayed();
        } else if (result.equals("Email or Password Not Valid")){
            loginpage.invalidEmailOrPasswordDisplayed();
        } else if (result.equals("Must fill the email or password")){
            loginpage.passwordNullDisplayed();
        } else {
            loginpage.emailNullDisplayed();
        }

    }

    @And("I don't input anything in all fields")
    public void iDonTInputAnythingInAllFields() throws Exception {
        loginpage.clickPasswordField();
        loginpage.clickEmailField();
    }

    @And("I clcik login button")
    public void iClcikLoginButton() {
        loginpage.clickLoginButton();
    }

    @Then("the all the error messages appear")
    public void theAllTheErrorMessagesAppear() {
        loginpage.passwordNullDisplayed();
        loginpage.emailNullDisplayed();
    }
}
