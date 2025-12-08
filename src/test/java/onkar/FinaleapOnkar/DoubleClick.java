package onkar.FinaleapOnkar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement dblClk = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions action = new Actions(driver);
		
		action.doubleClick(dblClk).perform();
		driver.switchTo().alert().accept();
		System.out.println("TC passed");
		
		WebElement rtClk = driver.findElement(By.xpath("//span[text()='right click me']"));
		action.contextClick(rtClk).perform();
		System.out.println("TC2 passes");
		
	}

}
