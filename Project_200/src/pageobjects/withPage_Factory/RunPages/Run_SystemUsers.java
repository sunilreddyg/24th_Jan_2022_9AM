package pageobjects.withPage_Factory.RunPages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobjects.withPage_Factory.Pages.HRM_LoginPage;
import pageobjects.withPage_Factory.Pages.MenuTabs;
import pageobjects.withPage_Factory.Pages.SystemUsers;

public class Run_SystemUsers 
{
	
	WebDriver driver;
	HRM_LoginPage loginpage;
	
	
	@Test(priority=0)
	public void CreateSystemUser()
	{
		loginpage=PageFactory.initElements(driver, HRM_LoginPage.class);
		driver.get(loginpage.pageurl);
		loginpage.userlogin("Admin", "admin123");
		
		MenuTabs menu=new MenuTabs(driver);
		menu.admin.click();
		
		SystemUsers users=new SystemUsers(driver);
		users.username.sendKeys("SunilReddy");
		new Select(users.userrole).selectByVisibleText("Admin");
		users.EmployeeName.sendKeys("Ananya Dash");
		new Actions(driver).pause(2000).sendKeys(Keys.ENTER).perform();
		new Select(users.Status).selectByVisibleText("Enabled");
		users.add.click();
	}
	
	
	
	 @BeforeClass
	  public void beforeClass() 
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
	  }
	
	  @AfterClass
	  public void afterClass() throws Exception
	  {
		  Thread.sleep(5000);
		  driver.close();
	  }

}
