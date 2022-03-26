package mq.selenium.editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_commands 
{

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.name("firstname"))
		.sendKeys("Ajay"+Keys.TAB
				+"Krishna"+Keys.TAB
				+"Ajaykrishna@gmail.com");
		Thread.sleep(4000);
		
		driver.switchTo().activeElement()
		.sendKeys(Keys.TAB+"Ajaykrishna@gmail.com"
		+Keys.TAB+"Hello123");
		
		//Selecting dropdown option using senkeys command
		driver.findElement(By.id("day")).sendKeys("21");
		
		//Sendkeys command with sequence keys
		driver.findElement(By.id("month")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		//Sendkeys commands with char sequence using chrod method.
		driver.findElement(By.id("year")).sendKeys(Keys.chord("2000"));
		
		
		//Selecting Radio button using Keybaord shortcuts
		driver.findElement(By.xpath("//input[@value='2']"))
		.sendKeys(Keys.SPACE);
		
		
	}

}
