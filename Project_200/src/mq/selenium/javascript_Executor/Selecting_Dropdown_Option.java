package javascript_Executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecting_Dropdown_Option 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		
		//Selecting dropdown using javascript
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("document.getElementById('day').value='21'");
		js.executeScript("document.getElementById('month').selectedIndex='6'");

	}

}
