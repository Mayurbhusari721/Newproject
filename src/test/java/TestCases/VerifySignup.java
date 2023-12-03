package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjectModel.SignupPageObject;
import resources.BaseClass;

public class VerifySignup extends BaseClass
{

	@Test
	public void signup() throws IOException, InterruptedException
	{
	 driverInitialize();
	 driver.get("https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus");
	 driver.manage().window().maximize();
	 Thread.sleep(1000);
	
	 SignupPageObject spo=new SignupPageObject(driver);
	 spo.enterFname().sendKeys("vivek");
	 spo.enterLname().sendKeys("somane");
	 spo.enterEmail().sendKeys("viveksomane123@gmail.com");
	 spo.selectJobTital().sendKeys("manager");
	}
}
