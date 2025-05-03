package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FuncionamientoBarraBusqueda {
     
	
	@Test
	public void FuncioBusqueda() {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://academiadigitalsolidaria.blogspot.com/?m=1");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"BlogSearch1\"]/div/form/div/input")).sendKeys("internet "+ Keys.ENTER);
	    
	    
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement element = 
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/header/div/div[3]/div[1]/div/div/form/div/input")));
		
		   driver.close();
	   
	}

	

}
