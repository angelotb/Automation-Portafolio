package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TiempoDeCargaEnBlog {
    
	@Test
	public void TiempoCarga(){
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://academiadigitalsolidaria.blogspot.com/?m=1");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"PageList1\"]/div/div[1]/div[1]/div/ul/li[2]/a")).click();
	    driver.close();
	    driver.quit();

	}

}
