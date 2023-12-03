package TestCases1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrintingAllLinks 
{
    @Test
	public void PrintingLinks() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		//for(int i=0; i<links.size(); i++)
		//	System.out.println(links.get(i).getText());
		
		for(WebElement k:links)
		{
			System.out.println(k.getText());
		}
			
	}

}
