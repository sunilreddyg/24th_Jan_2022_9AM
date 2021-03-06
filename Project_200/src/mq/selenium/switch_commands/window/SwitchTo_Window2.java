package switch_commands.window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Window2 {

	public static void main(String[] args) throws Exception {
		
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.instagram.com");
	    driver.manage().window().maximize();
	    
	    
	    //Hyper link open page at new window
	    WebElement Blog=driver.findElement(By.linkText("Blog"));
	    Blog.click();
	    Thread.sleep(4000);
	    
	    //Get mainwindow id
	    String MainWindow=driver.getWindowHandle();
	   
	    //Get All Windows ID's Opened throw Webdriver session
	    Set<String> AllWindowIDs=driver.getWindowHandles();
        for (String EachWindow : AllWindowIDs) 
        {
			driver.switchTo().window(EachWindow);
		}
        
        //Here is the assumption when loop is finished 
        //WebDriver contols should be available at last window
        System.out.println(driver.getTitle());
        driver.close();
        
        
        //Switch to Mainwindow
        driver.switchTo().window(MainWindow);
        System.out.println(driver.getTitle());
	    
	    
	    
	}

}
