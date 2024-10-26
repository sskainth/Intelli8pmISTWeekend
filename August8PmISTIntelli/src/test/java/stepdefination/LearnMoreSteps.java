package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utlility.BrowserBase;
import utlility.PageObjectManager;

import java.io.IOException;

public class LearnMoreSteps {

    PageObjectManager pageObjectManager;
    public LearnMoreSteps() throws IOException {
        BrowserBase b = new BrowserBase();
        pageObjectManager = new PageObjectManager(b.browserInvocation());
    }

    @Given("user clicks on click her to change")
    public void learnMore(){
        pageObjectManager.getLearnMorePage().clickChangeTextButton();
    }


    @Then("validate the text in page")
    public void validateTheTextInPage() {
        Assert.assertEquals("Hello, Learn More Aspirants",pageObjectManager.getLearnMorePage().getChangeText());
    }
}
