package mq.selenium.Radio_btn_And_Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecting_Radio_Button_And_Checkbox {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/recharge");
		driver.manage().window().maximize();
		
		//Selecting Radio button
		driver.findElement(By.xpath("//label[contains(.,'Postpaid')]")).click();
		Thread.sleep(2000);
		
		//Selecting checkbox
		driver.findElement(By.xpath("//i[contains(@class,'1nFl')]")).click();
	}

}
