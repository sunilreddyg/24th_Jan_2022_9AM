package mq.java.Loops;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Do_While_Example 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		//Do while with false condition
		int i=10;
		do {
			System.out.println(i);
		} while (i > 20);
		
		
		//Do while with true condition
		int j=1;
		do {
			System.out.println(j);
			j=j+1;
		} while (j <= 10);
		
		
		//Reloading page until expected title loaded
		String chrome_path="C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		boolean flag=false;
		int count=0;
		do {
			driver.get("http://instagram.com");
			
			
			try {
				flag=new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.titleContains("Facebook"));
			} catch (Exception e) {
					e.printStackTrace();
			}
			
			count=count+1;
			if(count==10)
			{
				throw new Exception("Page load failed ");
			}
			
		} while (flag==false);
		
		
		System.out.println("Page is Loaded");
		
		

	}

}
