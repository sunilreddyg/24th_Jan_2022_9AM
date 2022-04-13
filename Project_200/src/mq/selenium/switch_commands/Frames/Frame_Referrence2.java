package switch_commands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Frame_Referrence2 
{

	public static void main(String[] args) throws Exception {
		
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://epass.apcfss.in/");
	    driver.manage().window().maximize();
	    
	    //Switching to Frame using Frame ID
	    WebDriver MenuFrame=driver.switchTo().frame("menuFrame");
	    
	    //Clicking on feestructure link
	    MenuFrame.findElement(By.xpath("//a[@href='FeestructureReport.do']")).click();
	    Thread.sleep(4000);
	    
	    driver.switchTo().defaultContent();
	    
	    WebDriver BodyFrame=driver.switchTo().frame("bodyFrame");
	    new Select(BodyFrame.findElement(By.xpath("//select[@id='univ']")))
	   .selectByIndex(3);
	}

}
