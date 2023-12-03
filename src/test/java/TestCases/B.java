package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class B {
	
	@Test
	public void launchBrowser()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
	}

}
