package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecting_MultipleOptions_At_Dropdown 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		WebElement Menu_link=driver.findElement(By.xpath("//button[contains(.,'Select Menu')]"));
		Menu_link.click();
		
		WebElement Dropdown2=driver.findElement(By.id("exampleFormControlSelect2"));
		boolean flag=new Select(Dropdown2).isMultiple();
		System.out.println("Dropdown multiple selection status is --> "+flag);
	
		if (flag) 
		{
			System.out.println("Dropdown is multipel selection type");
			Select Dropdown2_Selector=new Select(Dropdown2);
			Dropdown2_Selector.deselectAll();   //It works for multiple selection dropdown only
			Dropdown2_Selector.selectByIndex(1);
			Dropdown2_Selector.selectByIndex(3);
			Dropdown2_Selector.selectByIndex(5);
			
			//Deselecting Single option from Multipel Selection Dropdown
			Dropdown2_Selector.deselectByIndex(3);
			
			System.out.println(Dropdown2_Selector.getAllSelectedOptions().size());
		} 
		else 
		{
			System.out.println("Dropdown is single selection type");
		}
			
		

	}

}
