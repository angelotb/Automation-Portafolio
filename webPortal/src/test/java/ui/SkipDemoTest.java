package ui;

import org.testng.annotations.Test;
          //It's requiered complete this Demo
public class SkipDemoTest {
	
	@Test(enabled=false)
	public void skipTest1()
	{
		System.out.println("skipping this test as it is not complete");
	}
    @Test
	public void skipTest2()
	{
		System.out.println("skipping this test as it is not complete");
	}
    
    @Test
	public void skipTest3()
	{
		System.out.println("skipping this test as it is not complete");
	}
}
