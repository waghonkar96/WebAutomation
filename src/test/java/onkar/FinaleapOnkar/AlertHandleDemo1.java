package onkar.FinaleapOnkar;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandleDemo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		//to handle alert
		Alert alrt1= driver.switchTo().alert();
		System.out.println("Alert text is :"+ alrt1.getText());
		
		alrt1.accept();
		driver.findElement(By.id("login1")).sendKeys("Onkar");
	}

}
