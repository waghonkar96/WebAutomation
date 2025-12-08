package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void openLoginPage()
	{
		driver.get("https://finaleap.in/finaleap_finserv/dsa/dsa/index.php");
	}
	
	
	public void login(String email,String password)
	{
		WebElement emailbox = driver.findElement(By.name("email"));
		WebElement passbox = driver.findElement(By.name("pass"));
        WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space(text())='Login']"));
        
        emailbox.sendKeys(email);
        passbox.sendKeys(password);
        loginButton.click();
        
        driver.get("https://finaleap.in/finaleap_finserv/dsa/dsa/index.php/credit_manager_user");
		System.out.println("Login successfull");
	}
	
	

}
