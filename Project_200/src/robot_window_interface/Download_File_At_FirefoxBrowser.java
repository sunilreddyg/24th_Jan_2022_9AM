package robot_window_interface;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Download_File_At_FirefoxBrowser 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		
		
		WebElement Download_link=driver.findElement(By.xpath("(//a[contains(.,'4.0.0')])[1]"));
		Download_link.click();
		Thread.sleep(5000);
		
		
		//Create object for robot
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyRelease(KeyEvent.VK_SHIFT);
		
		
		
		
		
		

	}

}
