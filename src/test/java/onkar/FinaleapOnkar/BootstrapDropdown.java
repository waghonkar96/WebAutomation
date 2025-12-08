package onkar.FinaleapOnkar;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		
		driver.findElement(By.id("menu1")).click();
		
		/*<ul class="dropdown-menu test" role="menu" aria-labelledby="menu1">
        <li role="presentation"><a role="menuitem" href="javascript:void(0);">HTML</a></li>
        <li role="presentation"><a role="menuitem" href="javascript:void(0);">CSS</a></li>
        <li role="presentation"><a role="menuitem" href="javascript:void(0);">JavaScript</a></li>
        <li role="presentation" class="divider"></li>
        <li role="presentation"><a role="menuitem" href="javascript:void(0);">About Us</a></li>
      </ul>*/
		
		List<WebElement> dd= driver.findElements(By.xpath("//ul[@class='dropdown-menu test' and @aria-labelledby='menu1'] //li[@role='presentation']"));
		
		System.out.println("Total element: "+dd.size());	
		
		for (WebElement i : dd)
		{
			System.out.println(i.getText());
			if(i.getText().equals("JavaScript"))
			{
				System.out.println("Test case passed");
			}
		}
	}

}
