package switch_commands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Frame_Using_Navigation_Method {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://epass.apcfss.in/");
	    driver.manage().window().maximize();
	    
	    
	    driver.navigate().to("https://epass.apcfss.in/menu.html");
	    Thread.sleep(4000);
	    
	    WebElement FeeStructure=driver.findElement(By.xpath("//a[@href='FeestructureReport.do']"));
	    FeeStructure.click();
	    Thread.sleep(4000);
	}

}
