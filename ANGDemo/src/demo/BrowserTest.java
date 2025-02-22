package demo;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class  BrowserTest {
    public static void main(String[] args) {
        
        System.setProperty("webdriver.edge.driver", "C:\\Browserdriver\\msedgedriver.exe");

        // Chromedriver driver = new ChromeDriver ();
     // FirefoxDriver driver = new FirefoxDriver();
      EdgeDriver driver = new EdgeDriver();
        driver.get("http://www.google.com");
        
        
    }
}
