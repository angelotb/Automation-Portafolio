package ui;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CapturingScreenshotDemo {
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.asx.com.au/");	
		driver.manage().window().maximize();
		driver.findElement(By.xpath("WebElement rectangle = driver.findElement(By.xpath(\"//*[@id=\\\"swatch\\\"]\"));")).click();
		
		// ESTUDIAR !!! with dependecies 
		
		
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		
		WebElement rectangle = driver.findElement(By.xpath("//*[@id=\"swatch\"]"));
		Actions action = new Actions(driver);
		action.contextClick(rectangle).perform();
	    
		
		
		
		
	
	}
}
