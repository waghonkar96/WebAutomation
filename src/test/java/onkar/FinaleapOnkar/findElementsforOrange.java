package onkar.FinaleapOnkar;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsforOrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.get("https://www.hirist.tech/");
			
			List<WebElement> inputbox = driver.findElements(By.tagName("input"));
			
			System.out.println("total textboxes = "+ inputbox.size());
			
			//total number of links
			
			List<WebElement> listOfLinks= driver.findElements(By.tagName("a"));	
			System.out.println("total links :" + listOfLinks.size());
			
			for(WebElement i : listOfLinks)
			{
				String exp = "https://www.hirist.tech/ecommerce-jobs.html";
				//String linkText = i.getText();
				String act = i.getAttribute("href");
				System.out.println(i.getText());
				if(exp.equals(act))
				{
					System.out.println("link found correctly");
					break;
				}
				//System.out.println(i.getAttribute("href"));
			}
			
	}

}
