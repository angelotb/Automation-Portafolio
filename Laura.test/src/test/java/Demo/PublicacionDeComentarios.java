package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PublicacionDeComentarios {
  
	
	@Test
	public void Comentarios() {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://academiadigitalsolidaria.blogspot.com/?m=1");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"PageList1\"]/div/div[1]/div[1]/div/ul/li[2]/a")).click();
		  
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement element = 
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("comment-editor")));
		
		
		WebElement frame1 = driver.findElement(By.name("comment-editor"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div[1]/div[2]")).click();
		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
		}

	

}
