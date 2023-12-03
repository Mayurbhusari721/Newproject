package TestCases1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CptureScreenshoot
{
 @Test
	public void Screenshoot() throws InterruptedException, IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search?q=selenium+hierarchy+diagram");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		TakesScreenshot s=(TakesScreenshot)driver;
		
		File src=s.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\Mayur Bhusari\\OneDrive\\Desktop\\Screenshots\\pic2.png");
		
		FileUtils.copyFile(src, dest);
		
	}
}
