package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DemoAutomatition {
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		
        //EdgarDriver driver = new EdgeDriver();
		driver.get("http://www.ebay.com");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("mobile");
	    driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).click();
	    driver.close();
	    //driver.quit();
	}

}
