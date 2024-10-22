package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlipcartHomePage {
    WebDriver driver;


    public FlipcartHomePage(WebDriver driver){
        this.driver=driver;
    }

    public void searchItem(String productName){
        driver.findElement(By.xpath("//input[@title ='Search for Products, Brands and More']")).sendKeys(productName);

    }

    public void clickSearchButton(){
        driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
    }

    public void clickNewestItem() {
        driver.findElement(By.xpath("//div[text()='Newest First']")).click();
    }

}
