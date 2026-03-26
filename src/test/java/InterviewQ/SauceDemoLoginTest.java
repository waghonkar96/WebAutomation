package InterviewQ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.SauceDemoLoginPage;

public class SauceDemoLoginTest {


	@Test
	public void VerifysuccesfullLogin()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//Initiate the Page Obeject
		SauceDemoLoginPage login = new SauceDemoLoginPage(driver);
		
		//Execute the test steps
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		login.clickLogin();
		
		//Verification
		String expectedURL = "https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
		
		driver.quit();
	}

}
