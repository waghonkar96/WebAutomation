package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
//	  driver.findElement(By.name("username")).sendKeys(un);
//	  driver.findElement(By.name("password")).sendKeys(psw);
//	  driver.findElement(By.xpath("//button[text()=' Login ']")).click();
//	
	
	
	
	@Test(dataProvider = "test1data")
	public void test1(String username,String password) throws InterruptedException {
		System.out.println(username+" | "+password);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(3000);
		  //driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}
	
	
	
	
	@DataProvider(name = "test1data")
	public Object[][] getData() {
		
		String projectpath = System.getProperty("user.dir");
		String excelPath = projectpath + "/Excel/Data.xlsx";
		
		Object data[][] = testData(excelPath, "LoginData");  
		return testData(excelPath, "LoginData");
	}
	
	
	
	
	public Object[][]  testData(String excelPath,String sheetName)
	{
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		
		Object data[][]= new Object[rowCount-1][colCount];
		
		for(int i = 1; i<rowCount; i++)
		{
			for(int j=0; j<colCount; j++)
			{
				String cellData = excel.getCellData(i, j);
				//System.out.println(cellData);
				data[i-1][j]= cellData;
			}
		}
		return data;
	}

}
