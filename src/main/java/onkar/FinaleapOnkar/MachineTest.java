package onkar.FinaleapOnkar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MachineTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://finaleap.in/finaleap_finserv/dsa/dsa/index.php");
		
		//code for entering id password
		WebElement emailbox = driver.findElement(By.name("email"));
		WebElement passbox= driver.findElement(By.name("pass"));
		WebElement LoginButton=driver.findElement(By.xpath("//button[normalize-space(text())='Login']"));
		
		emailbox.sendKeys("mayankcm@mailsac.com");
		passbox.sendKeys("Hitman@123");
		LoginButton.click();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.get("https://finaleap.in/finaleap_finserv/dsa/dsa/index.php/credit_manager_user");
		System.out.println(driver.getCurrentUrl());
		
		 
		
		//Clicking on Recommendation tab
		WebElement Recommendationtab= driver.findElement(By.xpath("//a[@href='https://finaleap.in/finaleap_finserv/dsa/dsa/index.php/credit_manager_user/Recommendation_applications']"));
		Recommendationtab.click();
		
		//clicking on customer edit name
		driver.findElement(By.xpath("//a[@href='https://finaleap.in/finaleap_finserv/dsa/dsa/index.php/credit_manager_user/camProcess?ID=z7TQBMzRYn&CM=jMQFwWKmpx']")).click();
		
		//selecting property owner
		//driver.findElement(By.id("select_property_owner_0")).click();
		
		driver.findElement(By.xpath("//i[contains(@class, 'fa-edit')]")).click();
		
		//income analysis page
		
		//Locate the dropdown element
		WebElement dropdown = driver.findElement(By.id("income_method_salaried"));
		
		String bankOption = "Bank";
		
		Select select = new Select(dropdown);
		
		select.selectByVisibleText(bankOption);
		System.out.println("Bank option selected.");
		
		//select.selectByVisibleText("Cash");
		//System.out.println("Cash option is selected");
		
		String val = select.getFirstSelectedOption().getText();
		System.out.println(val);
		
		if(val.equals("Cash"))
		{
			driver.findElement(By.id("cash_sal_1")).sendKeys("35000");
			driver.findElement(By.id("cash_sal_2")).sendKeys("3600");
			driver.findElement(By.id("cash_sal_3")).sendKeys("4000");
		}
		else if(val.equals("Bank"))
		{
			driver.findElement(By.id("gross_salary_1")).sendKeys("4000");
			driver.findElement(By.id("gross_salary_2")).sendKeys("4002");
			driver.findElement(By.id("gross_salary_3")).sendKeys("4004");
			
			driver.findElement(By.id("epf_deduction_1")).sendKeys("500");
			driver.findElement(By.id("epf_deduction_2")).sendKeys("502");
			driver.findElement(By.id("epf_deduction_3")).sendKeys("503");
			
			driver.findElement(By.id("loan_advance_deduction_1")).sendKeys("600");
			driver.findElement(By.id("loan_advance_deduction_2")).sendKeys("602");
			driver.findElement(By.id("loan_advance_deduction_3")).sendKeys("603");
			
			driver.findElement(By.id("any_other_deduction_1")).sendKeys("100");
			driver.findElement(By.id("any_other_deduction_2")).sendKeys("102");
			driver.findElement(By.id("any_other_deduction_3")).sendKeys("103");
			
			driver.findElement(By.id("net_salary_1")).sendKeys("10");
			driver.findElement(By.id("net_salary_2")).sendKeys("12");
			driver.findElement(By.id("net_salary_3")).sendKeys("14");
			
		}
		
			driver.findElement(By.name("submit_form_2")).click();
			
			System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
		
		/*Select dropdown = new Select(driver.findElement(By.id("income_method_salaried")));
		WebElement selectedOption = dropdown.getFirstSelectedOption();
		System.out.println("Selected Value: " + selectedOption.getText());*/
		
		
	
		
		
		
		

	}

}
