package MachineTest1;

import org.openqa.selenium.WebDriver;

import Base.BaseTest;
import Pages.LoginPage;

public class MachineTest1 extends BaseTest {

	public static void main(String[] args) {
		MachineTest1 test= new MachineTest1();
		test.runTest();
	}
	
	public void runTest()
	{
		setup();
		System.out.println("Browser opened");
		WebDriver driver=this.driver;
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openLoginPage();
		loginPage.login("mayankcm@mailsac.com", "Hitman@123");
		System.out.println("loggedin");
		
		
		
	}
	
	

}
