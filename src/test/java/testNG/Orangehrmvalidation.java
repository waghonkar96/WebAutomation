package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 import org.testng.Assert;
import org.testng.annotations.Test;

public class Orangehrmvalidation {
  @Test(dataProvider="TestData1",dataProviderClass = CustomDataSet.class)
  public void LoginHrm(String un, String psw) {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.findElement(By.name("username")).sendKeys(un);
	  driver.findElement(By.name("password")).sendKeys(psw);
	  driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	  //System.out.println("Current Url is : "+driver.getCurrentUrl());
	  String expecting ="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	  String actual = driver.getCurrentUrl();
	  Assert.assertEquals(actual, expecting);
  }
}
