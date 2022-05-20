package Starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class HomePage extends PageObject  {
    private By homeHeader(){
        return By.className("v-toolbar__title");
    }

    private By ProfileButton() { return By.xpath("//*[@class = 'v-icon notranslate fas fa-user theme--dark']");}

    private By LogoutButton(){
        return By.xpath("//*[@class = 'v-list-item v-list-item--link theme--light']/div[text() = ' Logout ']");
    }
    private By BuyButton(){
        return By.xpath("//*[@class = 'button-beli ml-3 v-btn v-btn--outlined theme--light v-size--small primary--text']");
    }
    private By CartButton(){
        return By.xpath("//*[@class = 'v-btn v-btn--icon v-btn--round theme--dark v-size--default']");
    }
    private By TransButton(){
        return By.xpath("//*[@class = 'v-list-item v-list-item--link theme--light']/div[text() = ' Transaksi ']");
    }
    private By Paidbutton(){
        return By.xpath("//*[@class = 'v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--large primary']");
    }





    @Step
    public boolean headerAppears(){
        return $(homeHeader()).isDisplayed();
    }
    @Step
    public boolean headerTextEqual(){
        return $(homeHeader()).getText().equals("AltaShop");
    }
    @Step
    public static OpenUrl url (String targetUrl){
        return new OpenUrl("https://qa.alta.id/");
    }
    @Step
    public void clickProfileButton(){
        $(ProfileButton()).click();
    }
    @Step
    public void clickLogoutButton(){

        $(LogoutButton()).click();
    }
    @Step
    public void clickBuyButton(){
        $(BuyButton()).click();
    }
    @Step
    public void clickCartButton(){

        $(CartButton()).click();
    }
    @Step
    public void clickTransButton(){

        $(TransButton()).click();
    }
    @Step
    public void clickPaidButton(){

        $(Paidbutton()).click();
    }
}
