package javaScriptExecutorEx;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/scroll/newTabVertical");
		Thread.sleep(4000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,1000)");
		System.out.println("scroll down done");
		
		js.executeScript("window.scrollBy(0,-500)");
		System.out.println("scroll up done");
		
		driver.get("https://demoapps.qspiders.com/ui/scroll/newTabHorizontal");
		Thread.sleep(4000);
		
		js.executeScript("window.scrollBy(500,0)");
		System.out.println("scroll right done");
		
		js.executeScript("window.scrollBy(-200,0)");
		System.out.println("scroll left done");
		
		

	}

}
