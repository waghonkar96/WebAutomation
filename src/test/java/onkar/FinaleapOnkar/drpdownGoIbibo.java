package onkar.FinaleapOnkar;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class drpdownGoIbibo {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.goibibo.com/");
		
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']")).click();
		driver.findElement(By.xpath("//p[contains(text(), 'Enter city or airport')]")).click();
		Thread.sleep(2000);

		// Step 2: Wait for the input field to appear (adjust this XPath based on the actual input tag)
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));

		// Step 3: Now send keys to the real input field
		inputField.sendKeys("P");
		//driver.findElement(By.xpath("//input[@fdprocesssedid='v8oeln']")).sendKeys("P");
		//List
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='sc-12foipm-29 gEpyDY']//span[@class='autoCompleteTitle ']"));
		System.out.println("total options : " + options.size());
		for(WebElement i : options) {
			if(i.getText().contains("Pune")) {
				i.click();
				System.out.println("Match found...");
				break;
			}
		}
		
		driver.findElement(By.xpath("//div[text()='Senior Citizen']/ancestor::label[@class = 'sc-12foipm-88 kSreEi']//div[@class = 'sc-12foipm-91 biWUTl']")).click();
		}

}
