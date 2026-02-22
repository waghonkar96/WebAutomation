package InterviewQ;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Open browser and then yt
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().window().maximize();
		//Opening yt 
		driver.get("https://youtube.com/");
		
		//Finding searchbox
		WebElement el = driver.findElement(By.xpath("//input[@class='ytSearchboxComponentInput yt-searchbox-input title']"));
		el.sendKeys("Dhurandhar");
		el.sendKeys(Keys.ENTER);
		
		List<WebElement> searches = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@id='video-title']")));
		//List<WebElement> searches= driver.findElements(By.xpath("//a[@id='video-title']"));
		
		searches.get(1).click();
		
		try {
			WebElement skipbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'ytp-skip-ad-button')]")));
			skipbtn.click();
		}
		catch (Exception e) {
			System.out.println("Ad not skipable or no add");
		}
		
		//scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400);");
		
		//finding comment box
		WebElement commentBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//yt-formatted-string[contains(text(),'Add a comment')]")));
		
		
		//clicking on comment box
		wait.until(ExpectedConditions.elementToBeClickable(commentBox));
		commentBox.click();
		
		//clicking on signinbutton
		WebElement signin = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ytd-modal-with-title-and-button-renderer//a[@aria-label='Sign in']")));
		signin.click();
	
	
		driver.quit();
	}
	
	

}
