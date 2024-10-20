package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utlility.ExcelHandler;

import java.io.IOException;

public class AmazonHomePage {

    WebDriver driver ;
    WebElement categoryElement ;//null know

    public AmazonHomePage(WebDriver driver){
        this.driver = driver ;
    }

    public void handleDropdown(){
        categoryElement =  driver.findElement(By.xpath("//div[@id='nav-search-dropdown-card']/child::div/child::select"));
        Select category = new Select(categoryElement);
        //  category.selectByIndex(10);
        //  category.selectByVisibleText("Clothing & Accessories");
        category.selectByValue("search-alias=automotive");

    }

    public void extractDropdownValue(){
        int categorySize = categoryElement.findElements(By.tagName("option")).size();

        for(int i =0 ; i < categorySize ; i++ ){
            String value = categoryElement.findElements(By.tagName("option")).get(i).getText();
            System.out.println(value);
        }
    }

    public void enterProductName(String productName){

       driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);
    }

    public void enterProductName(String sheetname , int  row , int column) throws IOException {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(ExcelHandler.readData(sheetname,row, column));
    }

    public void clickSearchIcon(){

        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    public void hoverAccountAndList(){
        WebElement accountElement = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions a = new Actions(driver);
        a.clickAndHold(accountElement).build().perform();

    }

    public void clickBabyWishList(){
      //  driver.findElement(By.xpath("//span[text()='Baby Wishlist']")).click();
        driver.findElement(By.partialLinkText("by Wishli")).click();
    }

}
