package onkar.FinaleapOnkar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverAndClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/menu");
		
		WebElement menu = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		WebElement submenu = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(menu).moveToElement(submenu).click().build().perform();
		System.out.println("TC passed");

	}

}
