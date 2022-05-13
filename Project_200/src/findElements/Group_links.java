package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Group_links {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		//Identifying single element
		WebElement Dropdown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		//Select Book OPtions
		new Select(Dropdown).selectByVisibleText("Books");
		
		WebElement Search_button=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		Search_button.click();
		Thread.sleep(5000);
		

		WebElement LeftNavigation=driver.findElement(By.xpath("//div[@class='left_nav browseBox']/ul[2]"));
		List<WebElement> Links=LeftNavigation.findElements(By.tagName("a"));
		
		for (int i = 0; i < Links.size(); i++) 
		{
			//Target Eachlink
			WebElement Eachlink=Links.get(i);
			String Linkname=Eachlink.getText();
			String Linkhref=Eachlink.getAttribute("href");
			
			//System.out.println(Linkname+"   "+Linkhref);
			
			//Click on each link
			Eachlink.click();
			Thread.sleep(2000);
			
			if(driver.getCurrentUrl().contains(Linkhref))
				System.out.println(Linkname+"  Pageloaded Successfull");
			else
				System.err.println(Linkname+" page laod failed");
			
			driver.navigate().back();
			Thread.sleep(2000);
			
			//Restore all links to avoid staleElemet reference exception
			LeftNavigation=driver.findElement(By.xpath("//div[@class='left_nav browseBox']/ul[1]"));
			Links=LeftNavigation.findElements(By.tagName("a"));
		}
	}

}
