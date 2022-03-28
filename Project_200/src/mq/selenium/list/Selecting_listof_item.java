package mq.selenium.list;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecting_listof_item {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		/*
		 * How to Select list of Items
		 * 		=> First click to open Listbox items
		 * 		=> Second click to select any one of item
		 */
		
		driver.findElement(By.linkText("Select Product Type")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@value='1'][contains(.,'Cards')]")).click();
	}

}
