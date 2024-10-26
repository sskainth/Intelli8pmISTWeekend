package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pageobjects.AmazonHomePage;
import pageobjects.SearchResultPage;
import utlility.BrowserBase;
import utlility.PageObjectManager;

import java.io.IOException;

public class AmazonSteps {

    PageObjectManager pageObjectManager;
    public AmazonSteps() throws IOException {

        BrowserBase b = new BrowserBase();
         pageObjectManager = new PageObjectManager(b.browserInvocation());
    }

    @Then("user validate the title of the page")
    public void userValidateTheTitleOfThePage() {
      String title =  pageObjectManager.getSearchResultPage().getTitleOfSearchResultPage();
        System.out.println(title);
    }
    
    @And("user clicks the search icon")
    public void clickSearchIcon(){
    pageObjectManager.getAmazonHomePage().clickSearchIcon();


    }


    @And("user validate the search results")
    public void userValidateTheSearchResults() {
        
    }

    @When("user click baby wish list option from Account menu")
    public void userClickBabyWishListOptionFromAccountMenu() {
        pageObjectManager.getAmazonHomePage().hoverAccountAndList();
        pageObjectManager.getAmazonHomePage().clickBabyWishList();
    }

    @Then("validate the navigation")
    public void validateTheNavigation() {

        Assert.assertEquals("Baby Wishlist",pageObjectManager.getBabyWishListPage().getBabyText());
    }

    @When("user enter the product name {string}")
    public void userEnterTheProductName(String productName) throws IOException {

        pageObjectManager.getAmazonHomePage().enterProductName("login",1,0);

    }

    @Then("verify whether the user navigates to the homepage")
    public void verifyWhetherTheUserNavigatesToTheHomepage() {

    }

    @When("user select the dropdown value from category dropdown")
    public void handleDropdown() {
        pageObjectManager.getAmazonHomePage().handleDropdown();
    }

    @And("user extracts the dropdown values")
    public void userExtractsTheDropdownValues() {
        pageObjectManager.getAmazonHomePage().extractDropdownValue();
    }

    @Then("validate the dropdown values")
    public void validateTheDropdownValues() {

    }


}
