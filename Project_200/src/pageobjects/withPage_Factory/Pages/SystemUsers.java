package pageobjects.withPage_Factory.Pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SystemUsers
{
	WebDriver driver;
	public SystemUsers(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	@FindBy(xpath = "//input[contains(@id,'userName')]")
	public WebElement  username;
	
	@FindBy(xpath = "//select[contains(@id,'userType')]")
	public WebElement  userrole;
	
	@FindBy(xpath = "//input[contains(@id,'empName')]")
	public WebElement  EmployeeName;
	
	@FindBy(xpath = "//select[contains(@id,'status')]")
	public WebElement  Status;
	
	@FindBy(xpath = "//input[@id='searchBtn']")
	public WebElement  search;
	
	@FindBy(xpath = "//input[@id='resetBtn']")
	public WebElement  reset;
	
	@FindBy(xpath = "//input[@id='btnAdd']")
	public WebElement  add;
	
	@FindBy(xpath = "//input[@value='Add']")
	public WebElement  Delete;

  
}