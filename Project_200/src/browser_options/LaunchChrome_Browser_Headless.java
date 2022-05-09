package browser_options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchChrome_Browser_Headless {

	public static void main(String[] args) throws Exception {
	
		
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(4000);
		
		System.out.println(driver.getTitle());

	}

}
