package objectidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Object_Identification_With_ClassName_Property {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.className("inputtext")).sendKeys("Darshan");
		driver.findElement(By.className("_9npi")).sendKeys("Darshan");
		driver.findElement(By.className("_6lth")).click();
		

	}

}
