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
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.close();
	}

}
