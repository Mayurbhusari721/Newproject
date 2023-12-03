package TestCases1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel1.LoginPageObject;
import resources1.BaseClass;

public class VerifyLogin1 extends BaseClass
{
@Test
public void login() throws IOException, InterruptedException
{

	   FileInputStream fs=new FileInputStream("C:\\Users\\Mayur Bhusari\\OneDrive\\Desktop\\Handling.xlsx");
	   
	   XSSFWorkbook workbook=new XSSFWorkbook(fs);
	   
	   XSSFSheet sheet=workbook.getSheetAt(0);
	   
	   XSSFRow row=sheet.getRow(0);
	   
	   XSSFCell cell1=row.getCell(0);
	   
	//   System.out.println(sheet.getRow(0).getCell(0));
	//   System.out.println(sheet.getRow(0).getCell(1));
	   
	   String c1=cell1.toString();
	   
	   XSSFCell cell2=row.getCell(1);
	   
	   String c2=cell2.toString();
	
	driverInitialize();
	driver.get("https://login.salesforce.com/?locale=in");
	
	Thread.sleep(2000);
	
	LoginPageObject lpo=new LoginPageObject(driver);
			
	lpo.enterusername().sendKeys(c1);
		
	Thread.sleep(2000);
	
	lpo.enterpassword().sendKeys(c2);
	
	Thread.sleep(2000);
	
	lpo.clickonlogin().click();
	
	Thread.sleep(2000);
	
	String actual=lpo.getErrorMessage().getText();
	
	String expected=" username and password. If you still can't log in, contact your Salesforce administrator.";
	
	//Assert.assertEquals(actual, expected, "something went wrong");
	//this is hard assertion
	
	SoftAssert a=new SoftAssert();
	//this is soft assertion
	
	a.assertEquals(actual,expected);
	
	System.out.println("some remaining code");
	
	a.assertAll();
}
}