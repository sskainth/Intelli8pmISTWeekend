package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageobjects.JqueryHomePage;
import utlility.BrowserBase;

import java.io.IOException;

public class JquerySteps {
    WebDriver driver;
    JqueryHomePage jqueryHomePage;
    public JquerySteps() throws IOException {
        BrowserBase browserBase = new BrowserBase();
        this.driver = browserBase.browserInvocation();
        jqueryHomePage = new JqueryHomePage(this.driver);

    }

    @Given("user perform drag and drop")
    public void performDragAndDrop(){
           jqueryHomePage.dragAndDrop();
    }

    @Then("validate the text")
    public void validateTheText() {

    }
}
