package ui_verification_commands.getCssvalue;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetLocation {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement BookADemo=driver.findElement(By.xpath("//a[@href='/hris-hr-software-demo/']"));
		
		
		//Get Object x and y coordinates
		int Objx=BookADemo.getLocation().getX();
		int Objy=BookADemo.getLocation().getY();
		
		System.out.println("Object x value is --> "+Objx);
		System.out.println("Object y value is --> "+Objy);
		
		
		//Verify Object visibility using coordinates
		if(Objx >0)
			System.out.println("Object is visible at webpage");
		else
			System.out.println("Object is Not visible at webpage");
		
		
		//Verifying object position at webpage
		if(Objx > 400)
			System.out.println("Objetct available at right side of the page");
		else
			System.out.println("Object available at left side of the page");
		

	}

}
