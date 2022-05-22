package miniproject;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCases extends Common_Reusable_Actions implements CommonObjects,InputData
{
	
	@BeforeClass
	public void setupbrowser()
	{
		LaunchBrowser(IP_browsername);
		load_webpage(IP_Page_url);
		set_explicitwait_time(IP_exp_timeout);
	}
	
	@Test(priority=0)
	public void userlogin()
	{
		Type_text(obj_login_email, IP_login_email);
		Type_text(obj_login_password, IP_login_password);
		click_element(obj_login_Submit_button);
	}
	
	
}
