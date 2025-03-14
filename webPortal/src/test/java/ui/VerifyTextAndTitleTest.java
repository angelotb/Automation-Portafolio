package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTextAndTitleTest {

	@Test
	public void titleTest()   
	{
	    SoftAssert softasser = new SoftAssert();
		String expectedtitle = "Artículos electrónicos, autos, ropa, objetos de colección, cupones y más | eBay";
		String expectedtext = "Buscar";
        WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String actualtitle = driver.getTitle();
		System.out.println("vrifying Title");
		softasser.assertEquals(actualtitle, expectedtitle, "Title verification failed");
		String actualtext = driver.findElement(By.xpath("//*[@id=\"gh-search-btn\"]")).getAttribute("value");
		System.out.println("vrifying Text");
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");
		System.out.println("closing broweser");
	
		
		driver.close();
		softasser.assertAll();
	} 
}
