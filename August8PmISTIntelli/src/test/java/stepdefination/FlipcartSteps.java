package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.AmazonHomePage;
import pageobjects.CartPage;
import pageobjects.FlipcartHomePage;
import pageobjects.SearchResultPage;
import utlility.BrowserBase;

import java.io.IOException;

public class FlipcartSteps {
    WebDriver driver ; // null knowledge // Global variable
    FlipcartHomePage homePage;

    public FlipcartSteps() throws IOException {

        BrowserBase b = new BrowserBase();
        this.driver = b.browserInvocation();
        homePage = new FlipcartHomePage(this.driver);

    }
/*
    @When("enter a valid username email hone number in the username <username> and <password> in password fields.")
    public void enterCredential(String usernam, String password){

    }


    @And("click Login** button icon on the top-right corner of the homepage")
    public void clickLoginRightCornerOfHomepage(){

    }

    @Then("user is successfully logged in and redirected to the homepage or their account dashboard.")
    public void userIsSuccessfullyLoggedInHomepage() {
    }

    @And("user’s name or profile icon should be displayed on the top-right corner of the page, confirming successful login.")
    public void NameDisplay() {
    }
    
    */
    @When("User enter the product name {string}")
    public void userEnterTheProductName(String productName) {
        homePage.searchItem(productName);
    }

    @And("user clicks the search icon button")
    public void clicksSearchButton() {
        homePage.clickSearchButton();
    }
    
    @And("user filters the product to newest")
    public void userFiltersTheProductToNewest() {
        
    }
    

    @And("user select the first product")
    public void userSelectTheFirstProduct() {
        
    }

    @Then("user check the cart if product is added")
    public void userCheckTheCartIfProductIsAdded() {
    }



}
