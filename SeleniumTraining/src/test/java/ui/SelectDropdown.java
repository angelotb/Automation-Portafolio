package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SelectDropdown {
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();*/
	WebElement dropdo = driver.findElement(By.name("input_8"));
		Select select = new Select(dropdo);
		
		select.selectByValue("level1");
		
		select.selectByVisibleText("1-10 employees");
		
		select.selectByIndex(5);*/
		
		//double select reviw video 18selenium//
		
		
		 	}	
	
	
}
