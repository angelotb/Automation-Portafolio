package ui;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleText {

	@Test
	public void titleTest()
	{
		String expecttitle = "Artículos electrónicos, autos, ropa, objetos de colección, cupones y más | eBay";
        WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String actualtitle = driver.getTitle();
		
		Assert.assertEquals(actualtitle, expecttitle);
		
	} 
}
