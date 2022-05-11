package mq.java.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class While_Loop_Example {

	public static void main(String[] args) throws Exception 
	{
		
		//Print Numbers 1 to 10
		int i=1;
		while(i < 11)
		{
			System.out.println(i);
			i=i+1;
		}
		
		
		//While loop with false condition
		int j=10;
		while( j < 1)
		{
			System.out.println("Never Executed");
		}
		
		
		//Manage Explicit wait using while loop
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		
		
		WebElement Retype_Email=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		
		int count=0;
		while(!Retype_Email.isDisplayed())  //!--Not
		{
			System.out.println("Checking Visibility");
			count=count+1;
			Thread.sleep(1000);
			
			if(count==30)
			{
				throw new Exception("Element Is Not visible at webpage");
			}
		}
		
		
		
	}

}
