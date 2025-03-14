package ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AutoSuggestionDropdp {
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		//driver.findElement(By.xpath("//*[@id=\"SW\"]/div[3]/div/div/a[1]")).click();//
		//driver.findElement(By.id("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/span")).click();//
		Actions actions = new Actions(driver);
		actions.moveByOffset(100,200).click().perform();
		
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).click();
	    WebElement from = driver.findElement(By.xpath("//input[@placeholder='from']"));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	    from.sendKeys("Sydney");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	    from.sendKeys(Keys.ARROW_DOWN);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	    from.sendKeys(Keys.ENTER);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	    
	    //ver otra vex falta expath //
	}
	

}
