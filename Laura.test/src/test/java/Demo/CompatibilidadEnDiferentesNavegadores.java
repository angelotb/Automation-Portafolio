package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CompatibilidadEnDiferentesNavegadores {

	@Test
	public void CompatibiNavegador() {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		
		driver.get("https://academiadigitalsolidaria.blogspot.com/?m=1");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"PageList1\"]/div/div[1]/div[1]/div/ul/li[2]/a")).click();
	    driver.close();
	    driver.quit();
	}

	

}
