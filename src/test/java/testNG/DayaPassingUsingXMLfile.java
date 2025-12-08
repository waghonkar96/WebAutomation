package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class DayaPassingUsingXMLfile {
	@Parameters({"un","psw"} )
  @Test
  public void testdata(String u, String ps) {
	  
	  System.out.println("Username is: "+ u);
	  System.out.println("PAssword is: "+ ps);
	  
  }
}
