package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        List <WebElement> le = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]"));
        ArrayList <String> output = new ArrayList<>();
        for(WebElement e:le){
            output.add(e.getText());
        }
        System.out.println(output);

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

    public Map<String, String> getShareHolderAndShareholdingValue(){

        Map <String, String> m = new HashMap<>();

        int columnOneSize  = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).size();

        for(int i =0 ; i < columnOneSize ; i++){
            String column1Value =  driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).get(i).getText();
            String colum2Value = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]")).get(i).getText();
            m.put(column1Value,colum2Value);
        }

        System.out.println(m);

        return m;


    }


}
