package switch_commands.window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Next_Window {

	public static void main(String[] args) throws Exception 
	{
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.instagram.com");
	    driver.manage().window().maximize();
	    
	    //Hyper link open page at new window
	    WebElement Blog=driver.findElement(By.linkText("Blog"));
	    Blog.click();
	    Thread.sleep(4000);
	    
	   
	    //Get All Windows ID's Opened throw Webdriver session
	    Set<String> AllWindowIDs=driver.getWindowHandles();
	    
	    //COnvert AllwindowIDs to Iterator
	    Iterator<String> itr=AllWindowIDs.iterator();
	    
	    //Read Each iterator with Next keywrod
	    String window1=itr.next();
	    String window2=itr.next();
	    
	    //Switch to Sub window from main window
	    driver.switchTo().window(window2);
	   
	    System.out.println(driver.getTitle());
	    
	   //Close Current Focused window
	    driver.close();
	    
	    //Switch Controls back to main window
	    driver.switchTo().window(window1);
	    System.out.println("Current Focused window title is --> "+driver.getTitle());
	}

}
