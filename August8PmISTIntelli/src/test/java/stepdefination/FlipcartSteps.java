package stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.AmazonHomePage;
import pageobjects.CartPage;
import pageobjects.SearchResultPage;
import utlility.BrowserBase;

import java.io.IOException;

public class FlipcartSteps {
    WebDriver driver ; // null knowledge // Global variable
    WebElement categoryElement ;
   // FlipcartHomePage homePage;
    //SearchResultPage resultPage;
   // CartPage cartPage;

    public FlipcartSteps() throws IOException {

        BrowserBase b = new BrowserBase();
        this.driver = b.browserInvocation();
    //    homePage = new AmazonHomePage(this.driver); //check for the constructor
      //  resultPage = new SearchResultPage(this.driver);
        //cartPage = new CartPage(this.driver);
    }

    @When("enter a valid username/email/phone number in the username field.")
    public void enterCredential(String usernam, String password){

    }


}
