package findElements;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Links 
{

	public static void main(String[] args) 
	{
		//FAQ:--> How to find broken links at webpage
		
		/*
		 * Find page response timeout under below link
		 * https://www.w3.org/Protocols/HTTP/HTRESP.html
		 * Free Editbox to check Apis
		 * 
		 * 
		 * https://reqbin.com/req/chcn9woc/rest-api-get-example
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     	 	
		driver.get("http://instagram.com");			  
		driver.manage().window().maximize();
		
		
		//identifying location of footer links
		WebElement Footer_Area;
		Footer_Area=driver.findElement(By.xpath("//footer[@role='contentinfo']/div/div"));

		//Get list of links under footer area..
		List<WebElement> Footer_links;
		Footer_links=Footer_Area.findElements(By.tagName("a"));
	
		boolean isValid=false;
		for (int j = 0; j < Footer_links.size(); j++) 
		{
			 WebElement Eachlink=Footer_links.get(j);
			 String Linkhref=Eachlink.getAttribute("href");
			
			 //calling Reusable method with Parameter
			 isValid =getResponseCode(Linkhref);
		
			 if(isValid==true)
			 {
				 System.out.println(Eachlink.getText()+"   "+isValid+"\n");
			 }
			 else
			 {
				 System.out.println(Eachlink.getText()+"   "+isValid+"\n");
			 }
		}
		

	}
	
	
	public static boolean getResponseCode(String urlString) 
	{
        boolean isValid = false;
        try {
            URL u = new URL(urlString);
            HttpURLConnection h = (HttpURLConnection) u.openConnection();
            h.setRequestMethod("GET");
            h.connect();
            System.out.println(h.getResponseCode());
            if (h.getResponseCode() !=404) 
            {
                isValid = true;
            }
        } catch (Exception e) {

        }
        return isValid;
    }

}
