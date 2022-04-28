package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Login_Syntax {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("https://www.facebook.com/"); 
		driver.manage().window().maximize();    

		//Enabled Javascript on auotmation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Typing text into entry box using javascript
		js.executeScript("document.getElementById('email').value='Darshan'");
		js.executeScript("document.getElementById('pass').value='Hello1234'");

		//use this syntax when element doesn't have id property
		WebElement Login_button=driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", Login_button);
		
	}

}
