package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utlility.BrowserBase;

import java.io.IOException;

public class SalesforceLoginSteps {
    WebDriver driver;

    public SalesforceLoginSteps() throws IOException {
        BrowserBase browserBase = new BrowserBase();
       this.driver = browserBase.browserInvocation();
    }

    @Given("user navigate to login page of sales force application")
    public void loginPage(){

    }

    @When("user enter username {string} and password {string}")
    public void userEnterUsernameAndPassword(String username, String password) {
    }

    @And("user clicks the login button")
    public void clickLoginButton() {
    }

    @Then("user verify the error message")
    public void userVerifyTheErrorMessage() {


    }
}
