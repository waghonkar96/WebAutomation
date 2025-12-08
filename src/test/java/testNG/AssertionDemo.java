package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
  @Test
  public void hardAssertion() {
	  String actual = "Selenium Is WebUI automation tool";
	  String expected =  "Seleniums";
	  
	  //Assert.assertEquals(actual, expected);
	  
	  //Assert.assertTrue(actual.equals(expected));
	  //Assert.assertTrue(actual.contains(expected));
	  Assert.assertFalse(actual.contains(expected));
	  System.out.println("Hard Assert Demo Completed");
  }
  
  @Test
  public void softAssertion()
  {
	  SoftAssert sobj = new SoftAssert();
	  String actual = "Welcome Everyone";
	  String expected = "D";
	  
	  //sobj.assertEquals(actual, expected, null);
	  //sobj.assertTrue(actual.contains(expected));
	  sobj.assertFalse(actual.contains(expected));
	  
	  System.out.println("Soft Assert Demo Completed");
	  
	  sobj.assertAll();
	  
}

}
