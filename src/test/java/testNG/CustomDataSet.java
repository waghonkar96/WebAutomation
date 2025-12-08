package testNG;

import org.testng.annotations.DataProvider;

public class CustomDataSet {
	
	@DataProvider(name="TestData1")
	public Object[][] dataset()
	{
		Object arr[][] = {{"admin","admin123"},{"tester1","tester123"},{"tester2","tester123"}};
		return arr;
	}

}
