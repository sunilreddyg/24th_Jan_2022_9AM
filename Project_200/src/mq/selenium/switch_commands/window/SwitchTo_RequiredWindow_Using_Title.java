package switch_commands.window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_RequiredWindow_Using_Title {

	public static void main(String[] args) throws Exception {
		
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.instagram.com");
	    driver.manage().window().maximize();
	    
	    //Hyper link open page at new window
	    WebElement  Meta=driver.findElement(By.linkText("Meta"));
	    Meta.click();
	    Thread.sleep(2000);
	    
	    //Hyper link open page at new window
	    WebElement  About=driver.findElement(By.linkText("About"));
	    About.click();
	    Thread.sleep(2000);
	   
	    
	    //Hyper link open page at new window
	    WebElement Blog=driver.findElement(By.linkText("Blog"));
	    Blog.click();
	    Thread.sleep(2000);
	   
	    //Get All Windows ID's Opened throw Webdriver session
	    Set<String> AllWindowIDs=driver.getWindowHandles();
        for (String EachWindow : AllWindowIDs) 
        {
			String EachWindow_title=driver.switchTo().window(EachWindow).getTitle();
			if(EachWindow_title.contains("Meta"))
			{
				break;
			}
		}
        
        System.out.println(driver.getTitle());
	    
	    
	  

	}

}
