package TestCases1;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjectModel1.SignupPageObject;
import resources1.BaseClass;

public class VerifySignup1 extends BaseClass

{
 @Test
 public void signup() throws IOException, InterruptedException
 {
	 driverInitialize();
	 driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
	 
	 driver.manage().window().maximize();
	 
	 Thread.sleep(2000);
	 
	 SignupPageObject spo=new SignupPageObject(driver);
	 
	 spo.enterfname().sendKeys("Mayur");
	 
	 spo.enterlname().sendKeys("bhusari");
	 
	 spo.enteremail().sendKeys("mbhusari141@gmail.com");
	 
	 WebElement j=spo.selectsjobtitle();
	 
	 Select s=new Select(j);
	 
	 s.selectByIndex(1);
	 
	 spo.entercompanyname().sendKeys("amazon");
	 
   	WebElement b=spo.selectemployeesname();
	 
   	Select a=new Select(b);
   	
   	a.selectByIndex(2);
   	
   	spo.enterphonenumber().sendKeys("8149745368");
	 	
 }
}
