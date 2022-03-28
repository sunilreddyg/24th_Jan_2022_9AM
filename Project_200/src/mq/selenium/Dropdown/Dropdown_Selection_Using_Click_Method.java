package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Selection_Using_Click_Method {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		
		//Collect Option Tag Xpath
		driver.findElement(By.xpath("//option[@value='29'][contains(.,'29')]")).click();
		
		//Collect Option Tag Xpath
		driver.findElement(By.xpath("//option[contains(.,'Nov')]")).click();
		
		//Collect Option Tag Xpath
		driver.findElement(By.xpath("//option[@value='2019'][contains(.,'2019')]")).click();
		
	}

}
