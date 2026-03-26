package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SauceDemoLoginPage {

	WebDriver driver;
	//Locators (The "What")
	WebElement username;
	WebElement password;
	WebElement loginButton;
	
	//Constructor to initialize webelement
	public SauceDemoLoginPage(WebDriver driver)
	{
		this.driver=driver;
		username = driver.findElement(By.id("user-name"));
		password = driver.findElement(By.id("password"));
		loginButton = driver.findElement(By.id("login-button"));
	}
	
	//Actions (the "How")
	
	public void enterUsername(String user)
	{
		username.sendKeys(user);
	}
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void  clickLogin()
	{
		loginButton.click();
	}
}
