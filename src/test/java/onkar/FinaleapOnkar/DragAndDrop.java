package onkar.FinaleapOnkar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
		
		//drag and drop
		
		WebElement src = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement trg = driver.findElement(By.xpath("//p[text()='Drop here']"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(src, trg).perform();
		System.out.println("Tc passed");
		System.out.println(trg.getText());
		}

}
