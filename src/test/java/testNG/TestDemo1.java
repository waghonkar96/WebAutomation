package testNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestDemo1 {
	@Test(priority = 2)
	public void chromeTest() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://finaleap.in/finaleap_finserv/dsa/dsa/index.php");
		System.out.println("Title is: "+driver.getTitle());
		Thread.sleep(4000);
		driver.close();
		
	}
	
	@Test(priority = 3)
	public void firefoxtest() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://finaleap.in/finaleap_finserv/dsa/dsa/index.php");
		System.out.println("Title is: "+driver.getTitle());
		Thread.sleep(4000);
		driver.close();
	}

	@Test(priority = 1)
	public void edgeTest() throws InterruptedException
	{
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println("Title is: "+driver.getTitle());
		Thread.sleep(4000);
		driver.close();
	}

}
