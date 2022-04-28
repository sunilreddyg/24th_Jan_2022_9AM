package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_HighlightObject {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		//Enable javascript on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//identifying object usng xpath
		WebElement Element=driver.findElement(By.xpath("//a[@title='Sign up for Facebook']"));
		
		//Performing javscript action at selected location
		js.executeScript("arguments[0].scrollIntoView()", Element);
		Thread.sleep(2000);
		
		//set background color to object
		js.executeScript("arguments[0].style.backgroundColor = 'yellow'", Element);
		Thread.sleep(2000);
		
		//set outline to object
		js.executeScript("arguments[0].style.outline ='thick solid red'",Element);
		Thread.sleep(2000);
		

	}

}
