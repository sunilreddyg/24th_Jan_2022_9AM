package mq.selenium.AutoComplete;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggesions {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.skyscanner.co.in/");
		driver.manage().window().maximize();
		
		
		WebElement From=driver.findElement(By.id("fsc-origin-search"));
	    From.click();
	    From.sendKeys(Keys.BACK_SPACE);
	    Thread.sleep(2000);
	    From.sendKeys("DEL");
	    
	    Thread.sleep(5000);  //Static timegap to load suggesstions
	    driver.findElement(By.xpath("(//span[contains(.,'hi (')])[2]")).click();

	}

}
