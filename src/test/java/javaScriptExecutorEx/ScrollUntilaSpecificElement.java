package javaScriptExecutorEx;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUntilaSpecificElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/scroll/newTabVertical");
		Thread.sleep(4000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement name = driver.findElement(By.xpath("//h1[text()='3. Becoming a registered user and use of passwords']"));
		
		js.executeScript("arguments[0].scrollIntoView(false)", name);
		System.out.println("done");
	}

}
