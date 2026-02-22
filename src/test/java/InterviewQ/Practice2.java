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

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Open browser and then yt
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().window().maximize();
				
		driver.get("https://youtube.com/");
		
		// Enter keyword in search query field of youtube
		WebElement el = driver.findElement(By.xpath("//input[@class='ytSearchboxComponentInput yt-searchbox-input title']"));
		el.sendKeys("Dhura");
		el.sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
		
		//Click on particular video
		List<WebElement> searchres = driver.findElements(By.xpath("//a[@id='video-title']"));
		System.out.println(searchres.size());
		searchres.get(1).click();
		
		//skip ad
		try {
			WebElement skipbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'ytp-skip-ad-button')]")));
			skipbtn.click();
		}
		catch (Exception e) {
			System.out.println("Ad not skipable or no add");
		}
		
		//Click on like button
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("ytd-watch-flexy")));
		WebElement likeHost = driver.findElement(By.tagName("like-button-view-model"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", likeHost);
		
		try {
			WebElement signin = wait.until(
			        ExpectedConditions.visibilityOfElementLocated(
			                By.xpath("//ytd-button-renderer//span[text()='Sign in']")));
			System.out.println("Sign-in prompt displayed");
			wait.until(ExpectedConditions.visibilityOf(signin));
			String str = signin.getText();
			System.out.println(str);
			if (str.equalsIgnoreCase("sign in")) {
				System.out.println("you are not sign in, please sign in for like");
			}
			
		}
		catch(Exception e)
		{
			System.out.println("not displayed");
		}
		
		

	}
	}


