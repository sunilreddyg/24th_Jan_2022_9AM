package objectidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRM_Login {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.live.com/owa/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]")).click();
		
		driver.findElement(By.id("i0116"))
		.sendKeys("sunilreddy.gajjala@outlook.com"+Keys.ENTER);
		
		Thread.sleep(4000);
		
		
		driver.findElement(By.id("i0118")).sendKeys("Hello12345");
		Thread.sleep(4000);
		driver.findElement(By.id("i0118")).sendKeys(Keys.ENTER);
		
		
		
	}

}
