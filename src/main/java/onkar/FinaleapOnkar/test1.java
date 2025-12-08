package onkar.FinaleapOnkar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
    	WebDriver driver=new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    	//username
    	WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("Admin");
        //Password
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        //Submit button
        driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
