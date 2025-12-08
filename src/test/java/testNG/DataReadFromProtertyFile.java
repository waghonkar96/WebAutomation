package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class DataReadFromProtertyFile {
  @Test
  public void testdata() throws IOException {
	  
	  File f1=new File(System.getProperty("user.dir")+"\\Test1.properties");
	  
	  FileInputStream fs = new FileInputStream(f1);
	  
	  Properties p1 = new Properties();
	  
	  p1.load(fs);
	  
	  System.out.println("Url is: "+ p1.getProperty("url"));
	  System.out.println("browser name is: "+ p1.getProperty("bname"));
	  System.out.println("browser version is: "+ p1.getProperty("bversion"));
	  
  }
}
