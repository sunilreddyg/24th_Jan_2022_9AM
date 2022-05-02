package capturescreen;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenWith_Time_Stamp {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(4000);
		
		
		//Creating time stamp
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-dd hh-mm-ss");
		String time=sdf.format(date);
		
		
		WebElement Form=driver.findElement(By.xpath("//div[@class='rgFsT   ']"));
		File src=Form.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("screens\\image"+time+".png"));


	}

}
