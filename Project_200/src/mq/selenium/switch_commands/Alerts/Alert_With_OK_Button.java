package switch_commands.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_With_OK_Button {

	public static void main(String[] args) throws Exception {
		
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	    Alert_prompt_link.click();
	    Thread.sleep(3000);
	    
	    //Switch to alert and read text on it
	    String alert_text=driver.switchTo().alert().getText();
	    System.out.println(alert_text);
	    
	    //Switch to alert and press Ok button
	    driver.switchTo().alert().accept();
	    
	    
	    WebElement Cancel=driver.findElement(By.xpath("//a[@href='#CancelTab']"));
	    Cancel.click();
	    System.out.println("Link is clicked");
	    
	   
	    
	}

}
