package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class testEdge {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		System.out.println("breowser opened and maximized");
		driver.get("https://www.zoho.com");
		System.out.println("Link opened");
		driver.quit();
		System.out.println("the browser is closed");
	}

}
