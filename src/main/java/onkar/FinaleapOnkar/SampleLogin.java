package onkar.FinaleapOnkar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SampleLogin {
	WebDriver driver;
	
	public SampleLogin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void login(String email,String password) throws InterruptedException
	{
		driver.get("https://finaleap.in/finaleap_finserv/dsa/dsa/index.php");
		
		WebElement emailbox = driver.findElement(By.id("email"));
		WebElement passbox = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.cssSelector(".login100-form-btn.btn.btn-primary.px-4"));

		
		emailbox.sendKeys(email);
		passbox.sendKeys(password);
		loginButton.click();
		
		driver.get("https://finaleap.in/finaleap_finserv/dsa/dsa/index.php/credit_manager_user");
		
		
		System.out.println("Login successfull");
		
		Thread.sleep(4000);
	}

	public void creditOps()
	{
		driver.findElement(By.xpath("//a[@href='https://finaleap.in/finaleap_finserv/dsa/dsa/index.php/credit_manager_user/Disbursement_Pending_Documents']")).click();
	}
	

}

