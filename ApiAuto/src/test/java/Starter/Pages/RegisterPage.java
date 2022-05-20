package Starter.Pages;

import Utils.General;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.Matchers.equalTo;

public class RegisterPage {
    String email;
    General general = new General();
    String base_url = "https://be-qa.alta.id/api/";

    @Step("I set an endpoint for register user")
    public String setEndpointRegister() {
        return base_url + "auth/register/";
    }

    @Step("I input {string} with {string} with {string}")
    public void inputNullField(String fullname, String email, String password) {
        JSONObject requestData = new JSONObject();
        if (email.equals("same")){
            this.email = "y";
        } else if(email.equals("rayhan48")){
            this.email = general.randomEmail();
            try (FileWriter file = new FileWriter("src//test//resources//filejson//email.json")) {
                file.write(this.email);
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            this.email = null;
        }
        requestData.put("fullname", fullname);
        requestData.put("email", this.email);
        requestData.put("password", password);

        SerenityRest.given().header("Content-Type", "application/json").body(requestData.toJSONString());
        SerenityRest.when().post(setEndpointRegister());
    }

    @Step("I request detail account user")
    public String getEmailUser() {
        return this.email;
    }

    @Step("I validate status code is {int}")
    public void validateStatuscode(int statusCode) {
        SerenityRest.then().statusCode(statusCode);
    }

    @Step("validate the data detail after create user")
    public void validateDataDetail(String message) {
        if (message.equals("success")) {
            SerenityRest.then().body("email", equalTo(this.email));
        } else {
            SerenityRest.then().body("email", equalTo(null));
        }
    }
}

