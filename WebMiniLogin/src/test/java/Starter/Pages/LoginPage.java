package Starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {


    private By emailField(){
        return By.xpath("//*[label[text()= 'Email']]//input");
    }
    private By passwordField(){
        return By.xpath("//*[label[text()= 'Password']]//input");

    }
    private By loginButton() {
        return By.xpath("//*[@class='v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary']");
    }
    private By errorMessage(){
        return By.xpath("//*[@class='v-alert v-sheet theme--light elevation-2 v-alert--border v-alert--border-top']");
    }




    @Step
    public static OpenUrl url (String targetUrl){
        return new OpenUrl("https://qa.alta.id/auth/login");
    }
    @Step
    public boolean validateOnLoginPage(){
        return $(loginButton()).isDisplayed();
    }
    @Step
    public void inputEmail(String email){
        $(emailField()).type(email);
    }
    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }
    @Step
    public void clickLoginButton(){
        $(loginButton()).click();
    }
    @Step
    public boolean errorMessageAppears(){
        return $(errorMessage()).isDisplayed();
    }
    @Step
    public boolean errorMessageEquals(String text){
        return $(errorMessage()).getText().equals(text);
    }

    public void headerAppears() {
    }

    public void headerTextEqual() {
    }
}
