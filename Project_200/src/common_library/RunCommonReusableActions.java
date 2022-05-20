package common_library;

import org.testng.annotations.Test;
import pageobjects.withPage_Factory.Pages.HRM_LoginPage;
import pageobjects.withPage_Factory.Pages.MenuTabs;
import pageobjects.withPage_Factory.Pages.SystemUsers;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class RunCommonReusableActions 
{
	
  WebDriver driver;
  CommonReusable_Actions action;
  
  @BeforeClass
  public void beforeClass()
  {
	  action=new CommonReusable_Actions();
	  action.LaunchBrowser("chrome");
	  driver=action.getdriver();
  }
  
  @Test
  public void tc001() 
  {
	  action.set_explicitwait_time(30);
	  HRM_LoginPage login=new HRM_LoginPage(driver);
	  action.load_webpage(login.pageurl);
	  action.Type_text(login.Username, login.UID);
	  action.Type_text(login.Password, login.PWD);
	  action.click_element(login.Login);
	  action.wait(3000);
	  
	  MenuTabs tabs=new MenuTabs(driver);
	  action.click_element(tabs.admin);
	  
	  SystemUsers users=new SystemUsers(driver);
	  action.Type_text(users.username, "Rajesh");
	  action.select_dropdown(users.userrole, "text", "Admin");
	  action.Type_text(users.EmployeeName, "Ananya Dash");
	  action.wait(2000);
	  action.Send_keyboard_keys(Keys.ENTER);
	  action.select_dropdown(users.Status, "index", "1");
	  action.capturescreen("SystemUserPage");
	  Assert.assertTrue(action.verify_titlePresented("OrangeHRM"));
	  
	
  }

}
