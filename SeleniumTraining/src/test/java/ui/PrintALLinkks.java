package ui;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;


public class PrintALLinkks {
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
	List<WebElement> alltags  =  driver.findElements(By.tagName("a"));
	System.out.println("total tags are: "+alltags.size());
	
	
	for(int i=0;i<alltags.size();i++)
	{
		System.out.println("Linjs on page are"+alltags.get(i).getAttribute("href"));
		System.out.println("Linjs on page are"+alltags.get(i).getText());
	}
		
	}

}
