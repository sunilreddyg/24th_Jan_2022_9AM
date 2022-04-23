package mq.java.conditional_Statements;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Else_if_condition 
{

	public static void main(String[] args) 
	{
		
		
		String browser="chrome";
		
		if (browser.equals("chrome")) 
		{
			System.out.println("Chrome Is Opened");
		}
		else if (browser.equals("firefox")) 
		{
			System.out.println("Firefox is Opened");
		}
		else if (browser.equals("ie")) 
		{
			System.out.println("Ie is Opened");
		}
		else 
		{
			System.out.println("Browser name is mismatched");
		}
		
		
		
		
		
		//Cross Browser Test
		WebDriver driver=null;
		String drivers_path="C:\\Users\\MINDQ\\Desktop\\recent_drivers\\";
		String BrowserName="firefox";
		
		if(BrowserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", drivers_path+"chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(BrowserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", drivers_path+"geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle().contains("Facebook"));
		
		
		

	}

}
