package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logintext {
	
public static String browser = "chrome";// External configuration - XLS.CSV.
public static WebDriver driver ;

	public static void main(String[] args) {
		if (browser.equals("firefox"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
		
		}
		else if (browser.equals("chrome"))
		{	
			WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver ();
		
		}
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		
		
	  driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
	  driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
		 
		 
		 driver.navigate().to("https://www.sugarcrm.com/");
		 String windowhandle = driver.getWindowHandle();
		 System.out.println(windowhandle);
		 
		
		driver.quit();
		
	}

}
