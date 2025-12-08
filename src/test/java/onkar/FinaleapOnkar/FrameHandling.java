package onkar.FinaleapOnkar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.findElement(By.xpath("//button[@class='tox-notification__dismiss tox-button tox-button--naked tox-button--icon']/div")).click();
		
		driver.switchTo().frame(0);
		WebElement framebox = driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
			
		
		//WebElement textBox =driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
		//textBox.clear();
		//textBox.sendKeys("Hiiii Helloo");
	}
}
