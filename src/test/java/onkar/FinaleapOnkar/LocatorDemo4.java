package onkar.FinaleapOnkar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		
		String textofBestseller = driver.findElement(By.xpath("//input[contains(@type,'text')]//following::a[text()='Bestsellers'][1]")).getText();
		System.out.println(textofBestseller);
		
		String text2 = driver.findElement(By.xpath(" //input[contains(@type,'text')]//preceding::span[@id='glow-ingress-line1']")).getText();
		System.out.println(text2);
		
		//preceeding
		//capture text hello from searchbox
		
}
}
