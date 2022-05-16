package findElements.webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Table_Data_From_SpecificRow_And_Cell {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.icicidirect.com/equity/sector-overview");
		driver.manage().window().maximize();
		
		
		WebElement Table=driver.findElement(By.id("tbl_sector0"));
		
		//Find list of rows available under table
		List<WebElement> rows=Table.findElements(By.tagName("tr"));
		rows.remove(0);   //Removing Header
		
		//Target Specificrow using index number
		WebElement SelectedRow=rows.get(3);
		
		//Target Cell available under specific row
		List<WebElement> cells=SelectedRow.findElements(By.tagName("td"));
		
		//Read Cell data by using index number
		String Cname=cells.get(0).getText();
		String MCap=cells.get(1).getText();
		String Nprofit=cells.get(7).getText();
		
		System.out.println(Cname+"   "+MCap+"    "+Nprofit);
		
		
	}

}
