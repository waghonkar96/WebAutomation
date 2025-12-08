package MachineTest1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunIt {
	
	public WebDriver driver;
	
	public void launch()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void main(String[] args) {
		System.out.println("Start");
		
		RunIt start = new RunIt();
		start.launch();
		
		System.out.println("end");
	

	}

}
