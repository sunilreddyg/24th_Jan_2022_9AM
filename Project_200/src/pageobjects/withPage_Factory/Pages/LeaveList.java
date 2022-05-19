package pageobjects.withPage_Factory.Pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LeaveList
{
	WebDriver driver;
	
	public LeaveList(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	@FindBy(xpath = "//input[@id='calFromDate']")
	public WebElement  FromEB;
	
	@FindBy(xpath = "//select[@data-handler='selectMonth']")
	public WebElement  From_Cal_month;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	public WebElement  From_Cal_year;
	
	@FindBy(xpath = "//a[@class='ui-state-default ui-state-hover'][contains(.,'11')]")
	public WebElement  From_Cal_Date;
	
	@FindBy(xpath = "(//select[@data-event='change'])[1]")
	public WebElement  To_EB;
	
	@FindBy(xpath = "(//select[@data-event='change'])[2]")
	public WebElement  To_Cal_Month;
	
	@FindBy(xpath = "//a[@class='ui-state-default ui-state-hover'][contains(.,'20')]")
	public WebElement  To_Cal_Date;
	
	@FindBy(xpath = "//input[contains(@id,'empName')]")
	public WebElement  Employee;
	
	@FindBy(xpath = "//select[contains(@id,'cmbSubunit')]")
	public WebElement  SubUnit;
	
	@FindBy(xpath = "//input[@id='btnSearch']")
	public WebElement  search;


	public boolean verify_url_of_LeaveList()
	{
		String CurrentUrl=driver.getCurrentUrl();
		return CurrentUrl.contains("leave/viewLeaveList");
	}

}