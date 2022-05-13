package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Group_Options 
{

	public static void main(String[] args) throws Exception {
		
		/*
		 * Example:--> verify expected cities displayed
		 * 	w.r.t state selection.
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://near-me.hdfcbank.com/branch-atm-locator/?lat=17.3688608&long=78.5307239&shared=1");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		
		String Exp_cities[]= 
			{
				"Please select state first","South Andaman",		
				"Anantapur","East Siang","Darrang","jdkfjld",
				"Chandigarh","jashpur","Dadra","Daman","New Delhi"
			};


			WebElement StateDropdown=driver.findElement(By.name("stateName"));
		    List<WebElement> AllStateOptions=StateDropdown.findElements(By.tagName("option"));
		    System.out.println("StateDropdown options available is --> "+AllStateOptions.size());

		    
		    
		    for (int i = 0; i < Exp_cities.length; i++)
		    {
		    	
		    		WebElement EachState=AllStateOptions.get(i);
		    		EachState.click();
		    		Thread.sleep(4000);
		    		
		    		WebElement CityNameDropdown=driver.findElement(By.name("cityName"));
		    		String AllCities=CityNameDropdown.getText();
		    		if(AllCities.contains(Exp_cities[i]))
		    		{
		    			System.out.println("for "+EachState.getText()+"Expected City name available --> "+Exp_cities[i]);
		    		}
		    		else
		    		{
		    			System.err.println("for "+EachState.getText()+"Expected City name not available --> "+Exp_cities[i]);
		    		}
				
			}
	}

}
