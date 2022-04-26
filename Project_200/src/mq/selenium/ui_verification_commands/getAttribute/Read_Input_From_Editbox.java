package ui_verification_commands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Input_From_Editbox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("Darshan");
		
		//Method usefull only to read input from editbox
		String inputvalue=email.getAttribute("value");
		System.out.println(inputvalue);
		
	}

}
