package pageobjects.withPage_Factory.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HRM_WelComePage 
{
	
	@FindBy(xpath = "//a[@id='welcome']") public WebElement welcomeObj;

}
