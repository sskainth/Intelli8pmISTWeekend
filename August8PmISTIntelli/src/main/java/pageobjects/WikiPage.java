package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class WikiPage {

    WebDriver driver;
    public WikiPage(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public List<String> getShareHolderValue(){
        List<String> columnOneValues = new ArrayList<String>();
       int columnOneSize  = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).size();
        for(int i =0 ; i < columnOneSize ; i++){
          String columnValues =  driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).get(i).getText();
            columnOneValues.add(columnValues);
        }

        return columnOneValues;

    }

    public List<String> getShareHoldingValue(){
        List <String> columnTwoValues = new ArrayList<String >();
        int columnTwoSize  = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]")).size();
        for(int i =0 ; i < columnTwoSize ; i++){
           columnTwoValues.add(  driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]")).get(i).getText());
        }
        return columnTwoValues;
    }


}
