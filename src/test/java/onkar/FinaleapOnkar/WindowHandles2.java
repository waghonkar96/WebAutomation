package onkar.FinaleapOnkar;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get("https://the-internet.herokuapp.com/windows");
		String parent = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		
		 Set<String> allwindowAfterClick= driver.getWindowHandles();
		 for (String child : allwindowAfterClick)
		 {
			 if(! parent.equals(child))
			 {
				 driver.switchTo().window(child);
			 }
		 }
		 WebElement disText= driver.findElement(By.xpath("//h3[text()='New Window']"));
		 System.out.println("Text displayed is : "+disText.getText());
		
		

	}

}
