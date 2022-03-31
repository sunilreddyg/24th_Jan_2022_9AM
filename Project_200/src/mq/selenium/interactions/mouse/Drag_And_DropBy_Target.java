package interactions.mouse;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_DropBy_Target 
{

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/personal/tools-and-calculators/personal-loan-calculator");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(10000);
		
		WebElement ScrollButton=driver.findElement(By.xpath("(//div[contains(@class,'rangeslider__handle')])[1]"));
		new Actions(driver).dragAndDropBy(ScrollButton, 150, 0).perform();
		Thread.sleep(2000);
		
		WebElement ScrollButton2=driver.findElement(By.xpath("(//div[contains(@class,'rangeslider__handle')])[2]"));
		new Actions(driver).dragAndDropBy(ScrollButton2, -100, 0).perform();
		
		
		
	}

}
