package onkar.FinaleapOnkar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		WebElement src = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement trg = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
		//action.clickAndHold(src).moveToElement(trg).release().perform();
		action.dragAndDrop(src, trg).build().perform();
		
		Thread.sleep(3000);
		

	}

}
