package ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class RadioButtonDemo {
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://almundo.com.ar/vuelos/aerolineas/avianca");
		//Actions actions = new Actions(driver);
		//actions.moveByOffset(100,200).click().perform();
	    driver.manage().window().maximize();
	    
	    WebElement radio1 = driver.findElement(By.xpath("(//mb-radio[@name='flightType'])[2]"));
	    radio1.click();
	    System.out.println(radio1.isSelected());
	    
	   
	}
	

}
