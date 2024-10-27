package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpiceHomePage {
    WebDriver driver;
    public SpiceHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickFromDropdown(){
        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
    }

    public void enterFromValue(String value){
        driver.findElement(By.xpath("//a[@value='"+value+"']")).click();
    }

    public void enterToValue(int a){
        driver.findElement(By.xpath("//div[@data-cel-widget='search_result_"+a+"']")).click();
        driver.findElement(By.xpath("//span[normalize-space(text())='Start my free trial']")).click();
        driver.findElement(By.cssSelector(".label.usernamelabel")).click();
    }
}
