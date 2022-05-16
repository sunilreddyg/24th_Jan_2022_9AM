package findElements.webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Specific_Record_Details 
{

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
		
		//iterate for number of rows
		for (int i = 0; i < rows.size(); i++) 
		{
			//Target Dynamic row using loop increment
			WebElement DynamicRow=rows.get(i);
			
			//Get Selected Row Text
			String RowText=DynamicRow.getText();
			
			if(RowText.contains("Wipro"))
			{
				//Target Cell available under specific row
				List<WebElement> cells=DynamicRow.findElements(By.tagName("td"));
				
				//Read Cell data by using index number
				String Cname=cells.get(0).getText();
				String MCap=cells.get(1).getText();
				String Nprofit=cells.get(7).getText();
				
				System.out.println(Cname+"   "+MCap+"    "+Nprofit);
			}
			
			
			
			
			
		}

	}

}
