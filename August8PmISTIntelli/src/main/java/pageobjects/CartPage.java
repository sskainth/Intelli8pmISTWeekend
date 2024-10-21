package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public void numberOfIteams(){
       String t = driver.findElement(By.id("//span[@id='sc-subtotal-label-activecart']")).getText();
    }
}
