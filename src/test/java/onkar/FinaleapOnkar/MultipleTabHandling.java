package onkar.FinaleapOnkar;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleTabHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parent1 = driver.getWindowHandle();
		System.out.println("parent 1: "+parent1);
		
		WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB);
			
		
		newTab.get("https://www.google.com/");
		String parent2 = driver.getWindowHandle();
		System.out.println("parent 2: "+parent2);
		System.out.println("a");
		Thread.sleep(6000);
		System.out.println("b");
		driver.findElement(By.name("q")).sendKeys("Selenium", Keys.ENTER);
		
		driver.close();
		
		driver.switchTo().window(parent1);
		driver.findElement(By.name("username")).sendKeys("Admin");
		
	}

}
