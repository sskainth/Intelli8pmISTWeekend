package utlility;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BrowserBase {

    WebDriver driver ;
    public WebDriver browserInvocation() throws IOException {

        File f = new File("src/main/resources/configuration/frameworkconfig.properties");
        FileInputStream fis = new FileInputStream(f);
        Properties properties = new Properties();
        properties.load(fis);
        properties.getProperty("browser"); // browser value

//        if(properties.getProperty("browser").equalsIgnoreCase("chrome")){
//             driver = new ChromeDriver();
//        }
//        else if(properties.getProperty("browser").equalsIgnoreCase("edge")){
//             driver = new EdgeDriver();
//        }
//        else if(properties.getProperty("browser").equalsIgnoreCase("safari")){
//            driver = new SafariDriver();
//        }
//        else if (properties.getProperty("browser").equalsIgnoreCase("firefox")) {
//            driver = new FirefoxDriver();
//        }
//        else{
//            throw new InvalidArgumentException("please check the browser value");
//        }

        switch (properties.getProperty("browser").toLowerCase()){
            case "edge":
                driver = new EdgeDriver();
                break;
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            default:
                throw  new InvalidArgumentException("please check the browser value");
        }

        driver.get(properties.getProperty("url"));
        return driver;
    }
}
