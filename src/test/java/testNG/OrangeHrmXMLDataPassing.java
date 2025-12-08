package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHrmXMLDataPassing {
	
	@Parameters({"un","psw"})
  @Test
  public void Login(String un, String psw)
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.findElement(By.name("username")).sendKeys(un);
	  driver.findElement(By.name("password")).sendKeys(psw);
	  driver.findElement(By.xpath("//button[text()=' Login ']")).click();
  }
}
