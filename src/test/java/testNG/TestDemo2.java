package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo2 {
	@Test(enabled = false)
	public void one()
	{
		System.out.println("TC one-- home passed");
	}
	
	@Test(description = "test case 2")
	public void two()
	{
		System.out.println("TC two-- car passed");
	}
	
	@Test(invocationCount = 3, priority = 3)
	public void three()
	{
		System.out.println("TC three-- bike passed");
	}

}
