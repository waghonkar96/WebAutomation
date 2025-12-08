package testNG;

import java.time.Duration;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AnnotationUseCase {
	static WebDriver driver;
  @Test(priority = 1)
  public void Login() {
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[text()=' Login ']")).click();
  }
  
  @Test(priority = 2)
  public void TitleValidation()
  {
	  String actualTitle = driver.getTitle();
	  String expected = "OrangeHRM";
	  System.out.println(actualTitle);
	  Assert.assertEquals(expected, actualTitle);
  }
  @Test (priority = 3)
  public void Logout() {
	  driver.findElement(By.className("oxd-userdropdown-tab")).click();
	  driver.findElement(By.linkText("Logout")).click();
  }
  
  @BeforeClass
  public void setup() {
	  System.out.println("before class it will call first//it will launch the browser");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }
  
  @AfterClass
  public void teardown() {
	  System.out.println("this will run after class// close browser");
	  driver.quit();
  }
  
}
