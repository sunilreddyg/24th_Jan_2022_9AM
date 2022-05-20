package pageobjects.withPage_Factory.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRM_LoginPage 
{
	WebDriver driver;
	public HRM_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	//Input Data
	public String pageurl="https://opensource-demo.orangehrmlive.com/";
	public String error_message="Invalid credentials";
	public String UID="Admin";
	public String PWD="admin123";
	
	//Object Locations
	@FindBy(xpath = "//input[@id='txtUsername']") public WebElement Username;
	@FindBy(xpath = "//input[@id='txtPassword']") public WebElement Password;
	@FindBy(xpath = "//input[@id='btnLogin']") public WebElement Login;
	@FindBy(xpath = "//a[contains(.,'Forgot your password?')]") public WebElement Forgot_your_password;
	@FindBy(xpath = "//span[contains(.,'Invalid credentials')]") public WebElement error_location;

	
	//Reusable Methos
	public void enterusername(String UID)
	{
		Username.sendKeys(UID);
	}
	
	public void enterpassword(String PWD)
	{
		Password.sendKeys(PWD);
	}
	
	public void clickLoginButton()
	{
		Login.click();
		
	}
	
	//Modual Framework
	public void userlogin(String UID,String PWD)
	{
		enterusername(UID);
		enterpassword(PWD);
		clickLoginButton();
	}
	
}
