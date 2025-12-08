package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {
		
	
	
  @Test(dataProvider="TestData1",dataProviderClass = CustomDataSet.class)
  public void scenarioTest(String un, String pass) {
	  System.out.println("Username is: "+un);
	  System.out.println("Password is: "+pass);
  }
}
