package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OrangeHRMDataPassingProperty {
  @Test
  public void DataReadFromPropertyFile() throws IOException, InterruptedException {
	  
	  //File f1 = new File("C:\\Users\\onkar\\Desktop\\FinaleapOnkar\\OrangeHrm.properties");
	  
	  FileInputStream fs = new FileInputStream("C:\\Users\\onkar\\Desktop\\FinaleapOnkar\\OrangeHrm.properties");
	  
	  Properties p1 = new Properties();
	  
	  p1.load(new FileInputStream("C:\\Users\\onkar\\Desktop\\FinaleapOnkar\\OrangeHrm.properties"));
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get(p1.getProperty("Url"));
	  
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	  driver.findElement(By.name("username")).sendKeys(p1.getProperty("un"));
	  driver.findElement(By.name("password")).sendKeys(p1.getProperty("pw"));
	  driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	  
	  
	  
  }
}
