package onkar.FinaleapOnkar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestDemo2 {
	
	@Test(priority = 2, description = "Test case 2", enabled = false)
	public void chromeTest() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://finaleap.in/finaleap_finserv/dsa/dsa/index.php");
		System.out.println("Title is: "+driver.getTitle());
		Thread.sleep(4000);
		driver.close();
		
	}
	
	@Test(priority = 3, description = "Test case 3")
	public void firefoxtest() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://finaleap.in/finaleap_finserv/dsa/dsa/index.php");
		System.out.println("Title is: "+driver.getTitle());
		Thread.sleep(4000);
		driver.close();
	}
	
	@Test(priority = 1, description = "Test case 1", invocationCount = 2)
	public void edgeTest() throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println("Title is: "+driver.getTitle());
		Thread.sleep(4000);
		driver.close();
	}
}
