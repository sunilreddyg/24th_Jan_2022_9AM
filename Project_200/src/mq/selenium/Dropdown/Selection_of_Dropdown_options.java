package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selection_of_Dropdown_options {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		
		//Selecting dropdown option using Option name
		new Select(driver.findElement(By.id("day")))
		.selectByVisibleText("26");
		
		//Selecting Dropdown Option using value property
		new Select(driver.findElement(By.id("month")))
		.selectByValue("9");
		
		//Selecting drodpown option using index number.
		new Select(driver.findElement(By.id("year")))
		.selectByIndex(21);
			
	}

}
