package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedireccionCorrectaAEvaluacionesExternas {
   
	@Test
	public void Redireccion() {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://academiadigitalsolidaria.blogspot.com/?m=1");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"PageList1\"]/div/div[1]/div[1]/div/ul/li[2]/a")).click();
	    
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement element = 
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/div/main/div[2]/div/div/article/div/div/div[2]/div/div[4]/h3/a/b/span")));
		
		
	   driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/main/div[2]/div/div/article/div/div/div[2]/div/div[4]/h3/a/b/span")).click();
	   driver.findElement(By.xpath("//*[@id=\"post-body-6217524956379575802\"]/div[5]/h3/span/a")).click();
	    
	    
	    driver.close();
	    
	}

	

}
