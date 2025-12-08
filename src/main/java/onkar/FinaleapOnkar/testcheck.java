package onkar.FinaleapOnkar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcheck {

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
    	WebDriver driver=new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	driver.get("https://www.oracle.com/in/java/technologies/downloads");
    	
	}

}
