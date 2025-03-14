package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {

	@BeforeTest
	public void loginToApplication()
	{
		System.out.println("login to application");
	}
	
	@AfterTest
	public void LogoutFromApplication()
	{
		System.out.println("logout from successful");
	}
	@BeforeMethod
	public void connectToDB() 
	{
		System.out.println("DB connected");
	}
	@AfterMethod
	public void disconnedtFromDB() 
	{
		System.out.println("DB disconnected");
	}
	
	@Test(priority=1)
	public void LoginTest()
	{
		System.out.println("login is successful");
		
	}
	@Test(priority=2)
	public void LogoutTest()
	{
		System.out.println("logout is successful");
		
	}

}