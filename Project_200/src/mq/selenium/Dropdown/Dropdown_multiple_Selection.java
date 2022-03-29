package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_multiple_Selection 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		
		WebElement Menu_link=driver.findElement(By.xpath("//button[contains(.,'Select Menu')]"));
		Menu_link.click();
		
		
		Select firstdropdown=new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		boolean flag=firstdropdown.isMultiple();
		System.out.println("Dropdown multiple selection status is --> "+flag);
		
		
		WebElement Dropdown2=driver.findElement(By.id("exampleFormControlSelect2"));
		boolean flag1=new Select(Dropdown2).isMultiple();
		System.out.println("Dropdown multiple selection status is --> "+flag1);
		
	}

}
