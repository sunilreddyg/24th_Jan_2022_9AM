package interactions.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_On_Element 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		//Perform Hover action on location
		WebElement JobsMenu=driver.findElement(By.xpath("//div[@class='mTxt'][contains(.,'Jobs')]"));
		new Actions(driver).moveToElement(JobsMenu).perform();
		
		//Performing click action using mouse interaction methods
		WebElement Engineering_jobs=driver.findElement(By.xpath("//a[contains(.,'Engineering jobs')]"));
		new Actions(driver).click(Engineering_jobs).perform();
		
		
		
		
		
	}

}
