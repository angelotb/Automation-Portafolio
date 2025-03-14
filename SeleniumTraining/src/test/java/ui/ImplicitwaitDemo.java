package ui;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ImplicitwaitDemo {
	
	
	public static void main(String[] args)  {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://ebay.com.au/");	
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/a"));
		
		Actions action = new Actions(driver);
	    action.moveToElement(element).perform();
	    
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/div[2]/div[1]/nav[2]/ul/li[5]/a")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/div[2]/div[1]/nav[2]/ul/li[5]/a")).click();
		
		
		
		
	
	}
}
