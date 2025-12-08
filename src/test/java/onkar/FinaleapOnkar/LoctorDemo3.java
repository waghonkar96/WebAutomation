package onkar.FinaleapOnkar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoctorDemo3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Xpath methods
		//1. text method 
		//<p data-v-7b563373="" data-v-0af708be="" class="oxd-text oxd-text--p orangehrm-login-forgot-header">Forgot your password? </p>
		
		//link
		//driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();
		///driver.navigate().back();
		
		//2.contains
		//<input data-v-1f99f73c="" class="oxd-input oxd-input--active" name="username" placeholder="Username" autofocus="">
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Admin");
		
		// 3.starts-with
		//<input data-v-1f99f73c="" class="oxd-input oxd-input--active" type="password" name="password" placeholder="Password">
		driver.findElement(By.xpath("//input[starts-with(@name,'passwo')]")).sendKeys("admin123");
		
		// 4.ends-with
		//<button data-v-10d463b7="" data-v-0af708be="" type="submit" class="oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"><!----> Login <!----></button>
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		
		
		
		
	}

}
