package Starter.Pages;
import Utils.General;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import java.io.FileWriter;
import java.io.IOException;

public class RegisterPage extends PageObject {
    General general = new General();
    String namalengkap;
    String emails;
    String Password;

    private By namalengkapField() {
        return By.xpath("//*[label[text()= 'Nama Lengkap']]//input");
    }

    private By emailField() {
        return By.xpath("//*[label[text()= 'Email']]//input");
    }

    private By PasswordField() {
        return By.xpath("//*[label[text()= 'Password']]//input");
    }

    private By registerButton() {
        return By.xpath("//*[@class='v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary']");
    }

        private By errorMessage(){
        return By.xpath("//*[@class='v-alert v-sheet theme--light elevation-2 v-alert--border v-alert--border-top']");
    }


    @Step
    public static OpenUrl url(String targetUrl) {
        return new OpenUrl("https://qa.alta.id/auth/register");
    }

    @Step
    public boolean validateOnRegisterPage() {
        return $(registerButton()).isDisplayed();
    }

    @Step
    public void inputnamalengkap(String namalengkap) {
        if (namalengkap.equals("same")) {
            this.namalengkap = "rayhan";
        } else {
            this.namalengkap = general.randomUsername();
            try (FileWriter file = new FileWriter("src//test//resources//filejson//name.json")) {
                file.write(this.namalengkap);
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        $(namalengkapField()).type(namalengkap);
    }
    @Step
    public void inputemail(String emails){
        if (emails.equals("New")) {
            $(emailField()).type(General.randomEmail());
        }
        else{
            $(emailField()).type(emails);
        }
    }

    @Step
    public void inputPassword(String Password){
        if (Password.equals("same")){
        this.Password = "rayhan1234";
    } else{
        this.Password = general.randomPassword();
        try (FileWriter file = new FileWriter("src//test//resources//filejson//password.json")) {
            file.write(this.Password);
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        $(PasswordField()).type(Password);
    }
    @Step
    public void clickRegisterButton(){
        $(registerButton()).click();
    }
    @Step
    public boolean errorMessageAppears(){
        return $(errorMessage()).isDisplayed();
    }
    @Step
    public boolean errorMessageEquals(String text){
        return $(errorMessage()).getText().equals(text);
    }

}
