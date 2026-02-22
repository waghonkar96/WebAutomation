package InterviewQ;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ImageBrokenLinkCheck {
	WebDriver driver;
	
	@BeforeMethod
	public void Openapp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://practice.expandtesting.com/broken-images#google_vignette");
	}
	
	@Test
	public void check()
	{
		//Locate all image element having jpj source
		List<WebElement> images = driver.findElements(By.xpath("//*[contains(@class,'d-flex mt-2')]/div/img[contains(@src,'.jpg')]"));
		
		//Print total number of images found
		System.out.println("the totoal image counnt is: "+ images.size());
	}
	
	@AfterMethod
	public void Closeapp()
	{
		driver.close();
	}

}
