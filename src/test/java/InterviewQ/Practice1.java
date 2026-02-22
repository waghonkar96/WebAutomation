package InterviewQ;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().window().maximize();
				
		driver.get("https://youtube.com/");
		
		try {
			WebElement el = driver.findElement(By.xpath("//input[@class='ytSearchboxComponentInput yt-searchbox-input title']"));
			el.sendKeys("Dhurandhar");
			el.sendKeys(Keys.ENTER);
			
			Thread.sleep(1000);
			List<WebElement> searchres = driver.findElements(By.xpath("//a[@id='video-title']"));
			System.out.println(searchres.size());
			searchres.get(1).click();

		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	
		
	}

}
