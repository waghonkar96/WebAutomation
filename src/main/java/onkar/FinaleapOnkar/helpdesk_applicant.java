package onkar.FinaleapOnkar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class helpdesk_applicant  extends valueFetching  {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
    	WebDriver driver=new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	String url =valueFetching.GetValues("url");
    	driver.get(url);
    	String  username =valueFetching.GetValues("username");
    	driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
    	String  password =valueFetching.GetValues("Password");
    	driver.findElement(By.xpath("//*[@class=\'form-control password']")).sendKeys(password);
    	
        driver.findElement(By.xpath("//button[@class='login100-form-btn btn btn-primary px-4']")).click();
        Thread.sleep(2000);
        String secondURl =valueFetching.GetValues("SecondUrl");
        driver.get(secondURl);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@href=\'https://finaleap.in/finaleap_finserv/dsa/dsa/index.php/Helpdesk/ListTicketsUser\']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class=\'btn btn-info\']")).click();
        Thread.sleep(1000);
       // Change Request
        WebElement selectLoanType = driver.findElement(By.xpath("//select[@id='Loan_Type']"));
        Select s=new Select(selectLoanType);
        s.selectByIndex(2);
         WebElement selectRequestType = driver.findElement(By.xpath("//select[@id='Request_Type']"));
         Select s2=new Select(selectRequestType);
         s2.selectByIndex(1);
         Thread.sleep(1000);
         WebElement selectIssueFor= driver.findElement(By.xpath("//select[@name='IssueFor']"));
         Select s3=new Select(selectIssueFor);
         s3.selectByIndex(0);
         Thread.sleep(1000);
         WebElement selectcustomer_name = driver.findElement(By.xpath("//input[@id='customerSearchInput']"));
         selectcustomer_name.click();
         selectcustomer_name.sendKeys("Nikhil");
         Thread.sleep(2000);
         selectcustomer_name.sendKeys(Keys.ARROW_DOWN);
         Thread.sleep(2000);
         selectcustomer_name.sendKeys(Keys.ENTER);
         //Change Data Request for Field Name
         driver.findElement(By.xpath("//input[@id='data_change_request']")).sendKeys("Pan Card Name changes");
         Thread.sleep(2000);
         //Current Data
         driver.findElement(By.xpath("//input[@id='current_data']")).sendKeys("UEUPN9838P");
         Thread.sleep(1000);
         //Update to
         driver.findElement(By.xpath("//input[@id='update_data']")).sendKeys("TYEPO9876R");
         Thread.sleep(1000);
         //Remarks
         driver.findElement(By.xpath("//textarea[@id='remarks']")).sendKeys("user update");
         Thread.sleep(2000);
         //Upload Files
         driver.findElement(By.xpath("//button[@id='up_img_0']")).click();
         Thread.sleep(2000);
         valueFetching.selectImages();
         driver.findElement(By.xpath("//button[@id='cust_submit']")).click();
         Alert a = driver.switchTo().alert();
         a.accept();
         Thread.sleep(2000);
         String currentUrl  =driver.getCurrentUrl();
         Thread.sleep(3000);
         driver.get(currentUrl);
         //second option- customer request
         //button click for raise ticket
         driver.findElement(By.xpath("//button[contains(text(),'Raise New Ticket')]")).click();
         Thread.sleep(1000);
         //Loan type
         WebElement selectLoanType1 = driver.findElement(By.xpath("//select[@id='Loan_Type']"));
         Select s21=new Select(selectLoanType1);
         s21.selectByIndex(2);
          //Request Type
          WebElement selectRequestType2 = driver.findElement(By.xpath("//select[@id='Request_Type']"));
          Select s22=new Select(selectRequestType2);
          s22.selectByIndex(2);
          Thread.sleep(1000);
          //customer name
          WebElement selectcustomer_name2 = driver.findElement(By.xpath("//input[@id='customerSearchInput']"));
          selectcustomer_name2.click();
          selectcustomer_name2.sendKeys("Nikhil");
          Thread.sleep(2000);
          selectcustomer_name2.sendKeys(Keys.ARROW_DOWN);
          Thread.sleep(2000);
          selectcustomer_name2.sendKeys(Keys.ENTER);
          //Issue Facing for
          WebElement selectIssueFor23= driver.findElement(By.xpath("//select[@name='IssueFor']"));
          Select s23=new Select(selectIssueFor23);
          s23.selectByIndex(0);
          Thread.sleep(1000);
          //Issue Related
          WebElement issue_related = driver.findElement(By.xpath("//select[@id='devices']"));
          Select sIR=new Select(issue_related);
          sIR.selectByIndex(1);
          //Details of the Issue
          driver.findElement(By.xpath("//textarea[@id='IssueDetails']")).sendKeys("field not visiables");
          //Remarks
          driver.findElement(By.xpath("//textarea[@id='remarks']")).sendKeys("user update");
          Thread.sleep(2000);
          //Upload Files
          driver.findElement(By.xpath("//img[@id='blah_0']")).click();
          Thread.sleep(2000);
          valueFetching.selectImages();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//button[@id='cust_submit']")).click();
          a.accept();
          Thread.sleep(2000);
          String currentUrl1  =driver.getCurrentUrl();
          Thread.sleep(3000);
          driver.get(currentUrl1);
          //Third scenario
          //button click for raise ticket
          driver.findElement(By.xpath("//button[contains(text(),'Raise New Ticket')]")).click();
          Thread.sleep(1000);
          //Loan type
          WebElement selectLoanType11 = driver.findElement(By.xpath("//select[@id='Loan_Type']"));
          Select s211=new Select(selectLoanType11);
          s211.selectByIndex(2);
           //Request Type
           WebElement selectRequestType21 = driver.findElement(By.xpath("//select[@id='Request_Type']"));
           Select s222=new Select(selectRequestType21);
           s222.selectByIndex(3);
           Thread.sleep(1000);
           //System Issue Details
           driver.findElement(By.xpath("//textarea[@id='comments_details']")).sendKeys("test data");
           //Remarks
           driver.findElement(By.xpath("//textarea[@id='remarks']")).sendKeys("user update");
           Thread.sleep(2000);
           //Upload Files
           driver.findElement(By.xpath("//img[@id='blah_0']")).click();
           Thread.sleep(2000);
           valueFetching.selectImages();
           Thread.sleep(2000);
           driver.findElement(By.xpath("//button[@id='cust_submit']")).click();
           a.accept();
           Thread.sleep(2000);
           String currentUrl2  =driver.getCurrentUrl();
           Thread.sleep(3000);
           driver.get(currentUrl2);

	}

}
