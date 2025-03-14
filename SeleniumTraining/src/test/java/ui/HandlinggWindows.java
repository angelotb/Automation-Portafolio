package ui;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class HandlinggWindows {
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/au/");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		actions.moveByOffset(100,200).click().perform();
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"1727194472988_l1b\"]/div[1]/article/div[2]/div/pbc-button[1]/a")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		
		Iterator<String> iterator = windowhandles.iterator();
		String parentwindow = iterator.next();
		System.out.println(parentwindow);
		String childwindow = iterator.next();
		System.out.println(childwindow);
		
		driver.switchTo().window(childwindow);
		
		driver.findElement(By.name("UserFirstName")).sendKeys("ang");
		driver.findElement(By.name("UserLastName")).sendKeys("Academy");
		driver.switchTo().window(parentwindow);
		
		
		
	
	}
}
