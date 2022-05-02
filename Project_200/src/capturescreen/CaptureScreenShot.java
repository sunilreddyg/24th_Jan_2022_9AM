package capturescreen;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenShot
{

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		
		//Captured screen shot and converted into output file
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Crate folder under project
		FileHandler.createDir(new File("screens"));
		//Dump image copy to local folder
		FileHandler.copy(src, new File("screens\\image.png"));
	}

}
