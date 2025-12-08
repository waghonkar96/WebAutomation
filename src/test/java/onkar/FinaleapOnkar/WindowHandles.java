package onkar.FinaleapOnkar;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get("https://demoqa.com/browser-windows");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		driver.findElement(By.id("tabButton")).click();
		Set<String> allWindows= driver.getWindowHandles();
		System.out.println(allWindows);
		for(String child : allWindows)
		{
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
				System.out.println("Window switched successfully" + driver.getWindowHandle());
			}
		}
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		driver.findElement(By.id("messageWindowButton")).click();
	}

}
