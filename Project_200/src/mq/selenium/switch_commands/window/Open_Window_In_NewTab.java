package switch_commands.window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_Window_In_NewTab {

	public static void main(String[] args) {
		
		
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.instagram.com");
	    driver.manage().window().maximize();
	    
	    
	    WebDriver MetaWindow=driver.switchTo().newWindow(WindowType.TAB);
	    MetaWindow.get("https://about.facebook.com/meta");
	    
	    
	    System.out.println(MetaWindow.getTitle());
	    
	   
	    
	}

}
