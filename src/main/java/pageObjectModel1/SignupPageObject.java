package pageObjectModel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObject
{
    public static WebDriver driver;
	private By fname=By.xpath("//input[@name='UserFirstName']");
	private By lname=By.xpath("//input[@name='UserLastName']");
	private By email=By.xpath("//input[@name='UserEmail']");
	private By jobtitle=By.xpath("//select[@name='UserTitle']");
	private By company=By.xpath("//input[@name='CompanyName']");
	private By employees=By.xpath("//select[@name='CompanyEmployees']");
	private By phone=By.xpath("//input[@name='UserPhone']");
	
	
	public SignupPageObject(WebDriver driver2)
	{
		this.driver=driver2;
	}
	public WebElement enterfname()
	{
		return driver.findElement(fname);
	}
	public WebElement enterlname()
	{
		return driver.findElement(lname);
	}
	public WebElement enteremail()
	{
		return driver.findElement(email);
	}
	public WebElement selectsjobtitle()
	{
		return driver.findElement(jobtitle);
	}
	public WebElement entercompanyname()
	{
		return driver.findElement(company);
	}
	public WebElement selectemployeesname()
	{
		return driver.findElement(employees);
	}
	public WebElement enterphonenumber()
	{
		return driver.findElement(phone);
	}
	
	
	
	
}
