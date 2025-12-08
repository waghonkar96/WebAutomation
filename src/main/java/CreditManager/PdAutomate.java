package CreditManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PdAutomate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://finaleap.in/finaleap_finserv/dsa/dsa/index.php");
		
		driver.findElement(By.id("email")).sendKeys("mayankcm@mailsac.com");
		driver.findElement(By.id("password")).sendKeys("Hitman@123");
		
		driver.findElement(By.xpath("//button[@class='login100-form-btn btn btn-primary px-4']")).click();
		driver.get("https://finaleap.in/finaleap_finserv/dsa/dsa/index.php/credit_manager_user");
		
		//Application Recommendtion
		driver.findElement(By.xpath("//a[@href='https://finaleap.in/finaleap_finserv/dsa/dsa/index.php/credit_manager_user/Recommendation_applications']")).click();
		
		driver.findElement(By.xpath("//a[@href='https://finaleap.in/finaleap_finserv/dsa/dsa/index.php/credit_manager_user/camProcess?ID=W26vjdQwbd&CM=jMQFwWKmpx']")).click();
	}

}
