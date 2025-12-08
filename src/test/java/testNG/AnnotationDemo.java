package testNG;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemo {
  @Test
  public void user() {
	  System.out.println("user is entered the web app");
  }
  
  @Test
  public void userRegistration() {
	  System.out.println("user is filling the registration form");
  }
  
  @BeforeMethod
  public void bMethod(){
	  System.out.println("Welcome to the web application");
  }
  
  @AfterMethod
  public void aMethod() {
	  System.out.println("End page of Web application");
  }
  
  @BeforeClass
  public void beClass() {
	  System.out.println("this will execute before class");
  }
  
  @AfterClass
  public void aClass()
  {
	  System.out.println("this will execute after class");
  }
  
  @BeforeTest
  public void beTest()
  {
	  System.out.println("This will execute before the test");
  }
  
  @AfterTest
  public void aTest()
  {
	  System.out.println("This will execute after the test");
  }
  
  @BeforeSuite
  public void beSuite()
  {
	  System.out.println("this will execute before a suite");
  }
  
  @AfterSuite
  public void aSuite()
  {
	  System.out.println("this will execute after a suite");
  }
  
  
}
