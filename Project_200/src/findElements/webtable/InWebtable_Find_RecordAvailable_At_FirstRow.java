package findElements.webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InWebtable_Find_RecordAvailable_At_FirstRow {

	public static void main(String[] args) {
		
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
		boolean recordstatus=false;
		for (int i = 0; i < rows.size(); i++) 
		{
			//Target Dynamic row using loop increment
			WebElement SelectedRow=rows.get(i);
			
			//Read Row Text
			String RowText=SelectedRow.getText();
			if(RowText.contains("Wipro"))
			{
				recordstatus=true;
				if(i==0)
					System.out.println("Record is available at first row");
				else
					System.out.println("Record is not available at first row, At present record available at -> "+i);
			}
			
			
		}
		System.out.println("Record Available status ---> "+recordstatus);
				
		

	}

}
