package onkar.FinaleapOnkar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {
	
	public WebDriver driver;
	
	
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SampleTest t1 = new SampleTest();
		System.out.println("test start");
		t1.setup();
		System.out.println("test end");
		WebDriver driver = t1.driver;
		
		SampleLogin login = new SampleLogin(driver);
		login.login("mayankcm@mailsac.com" , "Hitman@123");
		
		
		login.creditOps();
		
	}

}
