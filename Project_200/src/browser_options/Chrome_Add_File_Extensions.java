package browser_options;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Add_File_Extensions 
{

	public static void main(String[] args)
	{
		
		/*
		 * Downlaod chrome Extensions using crx file
		 * 	=> Downlaod crx file into local pc
		 * 	=> add extension by navigate using filepath
		 */
		ChromeOptions options=new ChromeOptions();
		options.addExtensions(new File("C:\\Users\\MINDQ\\Downloads\\IDE1.crx"));
		options.addExtensions(new File("C:\\Users\\MINDQ\\Downloads\\Truepath.crx"));
		options.addExtensions(new File("C:\\Users\\MINDQ\\Downloads\\XY.crx"));
		
		
		//Adding extensions to automation browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://facebook.com");
		

	}

}
