package robot_window_interface;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Upload_File {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement Upload_link=driver.findElement(By.xpath("//button[contains(.,'Upload & Download')]"));
		Upload_link.click();
		Thread.sleep(3000);
		
		
		WebElement ChooseFile_btn=driver.findElement(By.xpath("//input[@id='uploadFile']"));
		new Actions(driver).click(ChooseFile_btn).perform();
		Thread.sleep(3000);
		
		
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		
		//Copy String to Clipbaord
		String path="D:\\images\\Smoke_And_SanityTesting";
		StringSelection spath=new StringSelection(path);
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(spath, spath);
		
		//Press Control+V button using Robot class
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Because control is down keys. We must release after completed action
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		//Press Enter key
		robot.keyPress(KeyEvent.VK_ENTER);

	}

}
