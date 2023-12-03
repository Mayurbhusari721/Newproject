package resources1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass 
{
	public static WebDriver driver;
  public void driverInitialize() throws IOException
{
	FileInputStream fis=new FileInputStream("C:\\Users\\Mayur Bhusari\\eclipse-workspace\\MayurMaven\\src\\main\\java\\resources1\\data.properties");
	// this will read the properties file
	Properties prop=new Properties();
	prop.load(fis);
	String browsername=prop.getProperty("browser");
	if(browsername.equalsIgnoreCase("chrome"))
	{
		 driver=new ChromeDriver();
	}
	else if(browsername.equalsIgnoreCase("edge"))
	{
		 driver=new EdgeDriver();
	}
	
	else if (browsername.equalsIgnoreCase("firefox"))
		
	{
		 driver=new FirefoxDriver();
	}
	  
	else 
	{
		System.out.println("plz make sure you have correct browser");
	}
}
}
