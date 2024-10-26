package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BabyWishListPage {
    WebDriver driver ;
    public BabyWishListPage(WebDriver driver){
        this.driver = driver;
    }

    public void getTitleOfBabyWishListPage(){

    }

    public String getBabyText(){

       return driver.findElement(By.xpath("//h2[text()='Baby Wishlist']")).getText();

    }
}
