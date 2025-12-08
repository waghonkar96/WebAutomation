package onkar.FinaleapOnkar;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class valueFetching
{
	public static String GetValues(String value) throws IOException
	{
		String FilePath="D:\\my workspace\\FinaleapOnkar\\Data.properties";
		FileInputStream e=new FileInputStream(FilePath);
		Properties p=new Properties();
		p.load(e);
		String val =p.getProperty(value);	
		return val;
	}
    	
	public static void scrollBy(WebDriver driver)
	{
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		
	}
	
	public static void selectImages() throws InterruptedException, Exception
	{
		Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_D);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_D);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_D);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_A);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
	}
	
	public static void logoutbutton(WebDriver driver)
	{
		driver.findElement(By.xpath("(//a[@href='https://finaleap.in/finaleap_finserv/dsa/dsa/index.php/logout'])[2]")).click();
	}
    public static void SCF_Tab() throws Exception
    {
    	Robot r =new Robot();
    	r.keyPress(KeyEvent.VK_TAB);
    	Thread.sleep(1000);
    	r.keyPress(KeyEvent.VK_TAB);
    	Thread.sleep(1000);
    	r.keyPress(KeyEvent.VK_TAB);
    	Thread.sleep(1000);
    	r.keyPress(KeyEvent.VK_TAB);
    	Thread.sleep(1000);
    	r.keyPress(KeyEvent.VK_TAB);
    	Thread.sleep(1000);
    	r.keyPress(KeyEvent.VK_TAB);
    	Thread.sleep(1000);
    	r.keyPress(KeyEvent.VK_TAB);
    	Thread.sleep(1000);
    	r.keyPress(KeyEvent.VK_TAB);
    	Thread.sleep(1000);
    	r.keyPress(KeyEvent.VK_TAB);
    	Thread.sleep(1000);
    	r.keyPress(KeyEvent.VK_TAB);
    	Thread.sleep(2000);
    	r.keyPress(KeyEvent.VK_TAB);
    	Thread.sleep(4000);
    	r.keyPress(KeyEvent.VK_ENTER);
    }


}
