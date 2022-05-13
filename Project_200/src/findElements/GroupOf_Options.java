package findElements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GroupOf_Options {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg");
		Thread.sleep(3000);
		
		
		WebElement CategoriesObj=driver.findElement(By.id("month"));
		List<WebElement> AllOptions=new Select(CategoriesObj).getOptions();
		AllOptions.remove(0);
		
		for (WebElement EachOption : AllOptions) 
		{
			System.out.println(EachOption.getText());
			EachOption.click();
			Thread.sleep(500);
		}
	}

}
