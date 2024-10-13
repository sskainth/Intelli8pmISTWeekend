package pageobjects;

import org.openqa.selenium.WebDriver;

public class SearchResultPage {

    WebDriver driver;

    public SearchResultPage(WebDriver driver){
        this.driver = driver;
    }
    public String getTitleOfSearchResultPage(){

        String title = driver.getTitle();
        return title;
    }
}
