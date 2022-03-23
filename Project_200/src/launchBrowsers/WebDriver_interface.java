package launchBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver_interface {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("www.facebook.com");
		
		/*
		 * Exceptions:-->
		 * 
		 * 		IllegalStateException:-->
		 * 			=> This exception we receive when don't define
		 * 				environment path for browser drivers
		 * 							[OR]
		 * 		=> When we define wrong path  or Spell Mistakes
		 * 
		 * 		SessionNotCreateException:-->
		 * 			=> When your browser driver and browser version
		 * 				is mismatched
		 * 			
		 * 		
		 * 		InvalidArgumentException:-->
		 * 				=> When url format is mismatched
		 * 				=> Url should start with http://  or https://
		 */
		
		
	}

}
