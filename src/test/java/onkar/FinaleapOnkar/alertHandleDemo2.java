package onkar.FinaleapOnkar;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertHandleDemo2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//click for Alert js
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Alert alt1 = driver.switchTo().alert();
		System.out.println("Text of alert is :"+ alt1.getText());
		alt1.accept();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		driver.switchTo().alert().dismiss();
		
		//Alert 3
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		
		Alert alt3 = driver.switchTo().alert();
		driver.switchTo().alert().sendKeys("helloo");
		
		driver.switchTo().alert().accept();
		
		WebElement textfield= driver.findElement(By.xpath("//p[contains(text(), 'You entered')]"));
		
		String enteredString=textfield.getText();
		System.out.println("Entered string in popup is :"+enteredString);
		

	}

}
