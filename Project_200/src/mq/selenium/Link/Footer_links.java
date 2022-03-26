package mq.selenium.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Footer_links {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign Up")).click();
		System.out.println("Signup link title is --> "+driver.getTitle());
		driver.navigate().back();
		
		driver.findElement(By.linkText("Log In")).click();
		System.out.println("Login link title is --> "+driver.getTitle());
		driver.navigate().back();
		
	}

}
