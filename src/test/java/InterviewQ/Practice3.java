package InterviewQ;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-blink-features=AutomationControlled");
		WebDriver driver = new ChromeDriver(options);

		//Open browser and then make my trip
				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				driver.manage().window().maximize();
						
				driver.get("https://www.makemytrip.com/");
				
				
				WebElement chatpopup= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='https://jsak.mmtcdn.com/pwa/platform-myra-ui/static/sub_icons/close-icon.png']")));
				chatpopup.click();
				
				System.out.println("closed chat popup");
				
				
				WebElement loginPopup = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@data-cy='closeModal']")));
				loginPopup.click();
				System.out.println("Clicked on closed login popup");
				
				WebElement Hotel = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@data-cy='menu_Hotels']")));
				Hotel.click();
				System.out.println("Clicked on hotel");
				
				//Enter city details
				WebElement cityField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@data-cy='hotelCityLabel']")));
				cityField.click();
				
				WebElement entercity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@title='Where do you want to stay?']")));
				entercity.sendKeys("Phuket");
				//click on first suggestion
				List<WebElement> suggestions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']//*[@role='option']")));
				
	
					for (WebElement option : suggestions) {
						String text = option.getText();
						System.out.println(text);
						if(text.startsWith("Phuket")) {
							option.click();
							break;
						}
					}			
				
				
				
					System.out.println(driver.getPageSource().contains("id=\"checkin\""));

				
					driver.findElement(By.xpath("//input[@data-cy='checkin']")).click();
//				WebElement checkinDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkin")));
//				checkinDate.click();
				
				WebElement ciDate = driver.findElement(By.xpath("//div[@aria-label='Wed Feb 25 2026']"));
				ciDate.click();
				
				WebElement coDate = driver.findElement(By.xpath("//div[@aria-label='Sat Feb 28 2026']"));
				coDate.click();
				
				driver.findElement(By.xpath("//button[text()='APPLY']")).click();
				System.out.println("search done");
				
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-cy='submit']"))).click();
				
				wait.until(ExpectedConditions.urlContains("hotel-listing"));

				
	}

}
