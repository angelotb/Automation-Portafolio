package Demo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AccesoALeccionesDeesdePaginaModulo {

	@Test
	public void AccesoModulo() {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://academiadigitalsolidaria.blogspot.com/?m=1");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"PageList1\"]/div/div[1]/div[1]/div/ul/li[3]/a")).click();
	    
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement element = 
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/div/main/div[2]/div/div/article/div/div/div[2]/div/div[4]/div[1]/h3/b/span/a")));
		
		
	   driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/main/div[2]/div/div/article/div/div/div[2]/div/div[4]/div[1]/h3/b/span/a")).click();

        
	   driver.close();

	}

	

}
