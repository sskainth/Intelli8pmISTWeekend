package pageobjects;

import org.openqa.selenium.By;
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

    public void selectItem()
    {
        driver.findElement(By.xpath("//button[@id='a-autoid-1-announce']")).click();
    }

    public void clickCart(){
        driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
    }


}
