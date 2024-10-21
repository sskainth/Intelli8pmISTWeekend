package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pageobjects.AmazonHomePage;
import pageobjects.CartPage;
import pageobjects.SearchResultPage;
import utlility.BrowserBase;

import java.io.IOException;

public class AmazonSteps {

    WebDriver driver ; // null knowledge // Global variable
    WebElement categoryElement ;
    AmazonHomePage homePage;
    SearchResultPage resultPage;
    CartPage cartPage;

    public AmazonSteps() throws IOException {

        BrowserBase b = new BrowserBase();
        this.driver = b.browserInvocation();
        homePage = new AmazonHomePage(this.driver); //check for the constructor
        resultPage = new SearchResultPage(this.driver);
        cartPage = new CartPage(this.driver);
    }

    @Then("user validate the title of the page")
    public void userValidateTheTitleOfThePage() {
      String title =  resultPage.getTitleOfSearchResultPage();
        System.out.println(title);
    }
    
    @And("user clicks the search icon")
    public void clickSearchIcon(){

        homePage.clickSearchIcon();

    }


    @And("user validate the search results")
    public void userValidateTheSearchResults() {
        
    }

    @When("user click baby wish list option from Account menu")
    public void userClickBabyWishListOptionFromAccountMenu() {
            homePage.hoverAccountAndList();
            homePage.clickBabyWishList();

    }

    @Then("validate the navigation")
    public void validateTheNavigation() {
        
    }

    @When("user enter the product name {string}")
    public void userEnterTheProductName(String productName) {


        homePage.enterProductName(productName);

    }

    @Then("verify whether the user navigates to the homepage")
    public void verifyWhetherTheUserNavigatesToTheHomepage() {

    }

    @When("user select the dropdown value from category dropdown")
    public void handleDropdown() {
        homePage.handleDropdown();
    }

    @And("user extracts the dropdown values")
    public void userExtractsTheDropdownValues() {
        homePage.extractDropdownValue();
    }

    @Then("validate the dropdown values")
    public void validateTheDropdownValues() {

    }

    @When("User mouse hover on Prime menu option")
    public void mouseHoverPrime(){
        homePage.hoverPrime();

    }

    @And("Click on join prime button")
    public void clickOnJoinPrimeButton() {
        homePage.clickPrimeJoin();

    }

    @Then("user validate the title of the prime page")
    public void userValidateTheTitleOfThePrimePage() {

    }

    /*@When("user enter the product name 'Keyboard'")
    public void enterKeyboard(String productName){
        homePage.enterProductName(productName);
    }*/


    @And("Select the keyboard from list")
    public void selectKeyboardFromList() {
        homePage.selectKeyboard();
        System.out.println("added");

    }

    @And("click on cart")
    public void clickOnCart() {
        homePage.clickOncart();
    }

    @Then("user validate the number of items")
    public void userValidateNumberOfItems() {
        cartPage.numberOfIteams();
    }
}
