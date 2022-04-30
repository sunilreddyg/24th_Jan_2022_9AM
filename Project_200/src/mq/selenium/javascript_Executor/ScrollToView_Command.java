package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToView_Command {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		//enabling javascript on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		WebElement Element=driver.findElement(By.xpath("(//span[@filter-id='-1'])[2]"));
		js.executeScript("arguments[0].scrollIntoView(false)", Element);

		
		/*
		 *      true - the top of the element will be aligned 
		 *      to the top of the visible area of the 
		 *      scrollable ancestor
		 *      
		 *      element.scrollIntoView(true);
		 *
		 *		false - the bottom of the element will be 
		 *      aligned to the bottom of the visible area of 
		 *      the scrollable ancestor.
		 *      
		 *      element.scrollIntoView(false);
		 */
	}

}
