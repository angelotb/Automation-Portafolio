package ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CheckBoxDemo {
	
	@test
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/request-demo/");
		//Actions actions = new Actions(driver);
		//actions.moveByOffset(100,200).click().perform();
		driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.name("input_12.1")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	    
	    System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']").size());
	    
	    driver.close();
	    // ver con varios checkbox
	   
	}
	

}
