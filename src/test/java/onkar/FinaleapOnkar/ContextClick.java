package onkar.FinaleapOnkar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		WebElement ChoosePic =driver.findElement(By.id("picture"));
		
		Actions act = new Actions(driver);
		act.contextClick(ChoosePic).perform();

	}

}
