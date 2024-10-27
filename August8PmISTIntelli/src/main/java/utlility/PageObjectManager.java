package utlility;

import org.openqa.selenium.WebDriver;
import pageobjects.*;

public class PageObjectManager {

   private WebDriver driver;
    public PageObjectManager(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public AmazonHomePage getAmazonHomePage(){
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        return amazonHomePage;
    }

    public BabyWishListPage getBabyWishListPage(){
        BabyWishListPage wishListPage = new BabyWishListPage(driver);
        return wishListPage;
    }

    public WikiPage wikiPage(){
        WikiPage wikiPage = new WikiPage(driver);
        return wikiPage;
    }

    public SearchResultPage getSearchResultPage(){
        SearchResultPage resultPage = new SearchResultPage(driver);
        return resultPage;
    }

    public LearnMorePage getLearnMorePage(){
        LearnMorePage learnMorePage = new LearnMorePage(driver);
        return learnMorePage;
    }

    public SpiceHomePage getSpiceHomePage(){
        SpiceHomePage spiceHomePage = new SpiceHomePage(driver);
        return spiceHomePage;
    }
}
