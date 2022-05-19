package pageobjects.withPage_Factory.RunPages;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobjects.withPage_Factory.Pages.HRM_LoginPage;
import pageobjects.withPage_Factory.Pages.HRM_WelComePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Run_HRM_Login 
{
	WebDriver driver;
	HRM_LoginPage loginpage;
	
	@Test(priority=0)
	public void verifyLogin_With_invalidPassword() throws Exception
	{
		driver.get(loginpage.pageurl);
		loginpage.enterusername(loginpage.UID);
		loginpage.enterpassword("dhfkjhdf");
		loginpage.clickLoginButton();
		Thread.sleep(5000);
		Assert.assertTrue(loginpage.error_location.isDisplayed());;
		Reporter.log("Error location is displayed");
		
		String Act_msg=loginpage.error_location.getText();
		Assert.assertEquals(loginpage.error_message, Act_msg);
		Reporter.log("Expected error message displayed");
	}
	
	@Test(priority=1)
	public void verifyLogin() throws Exception
	{
		driver.get(loginpage.pageurl);
		loginpage.enterusername(loginpage.UID);
		loginpage.enterpassword(loginpage.PWD);
		loginpage.clickLoginButton();
		Thread.sleep(5000);
		HRM_WelComePage welcome=PageFactory.initElements(driver, HRM_WelComePage.class);
		Assert.assertTrue(welcome.welcomeObj.isDisplayed());
		Reporter.log("User login is successfull Welcome object displayed");
	}
 
 
	 @BeforeClass
	  public void beforeClass() 
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  loginpage=PageFactory.initElements(driver, HRM_LoginPage.class);
	  }
	
	  @AfterClass
	  public void afterClass() throws Exception
	  {
		  Thread.sleep(5000);
		  driver.close();
	  }

}
