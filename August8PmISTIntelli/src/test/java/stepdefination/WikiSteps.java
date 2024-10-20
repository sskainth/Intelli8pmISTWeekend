package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageobjects.WikiPage;
import utlility.BrowserBase;

import java.io.IOException;

public class WikiSteps {
    WikiPage wikiPage;
    public WikiSteps() throws IOException {
        BrowserBase browserBase = new BrowserBase();
        wikiPage = new WikiPage( browserBase.browserInvocation());

    }

    @Given("user extracts the share holder value")
    public void shareHolder(){
            wikiPage.getShareHolderValue();
    }

    @When("user extracts the share holding value")
    public void shareHoldingValue() {
        wikiPage.getShareHoldingValue();
    }

    @Then("user validate the mapping of share holder and share holding value")
    public void userValidateTheMappingOfShareHolderAndShareHoldingValue() {

        Assert.assertEquals("Promoters group",wikiPage.getShareHolderValue().get(0));
        Assert.assertEquals("14.61%",wikiPage.getShareHoldingValue().get(0));
        Assert.assertEquals("Total",wikiPage.getShareHolderValue().get(5));


    }
}
