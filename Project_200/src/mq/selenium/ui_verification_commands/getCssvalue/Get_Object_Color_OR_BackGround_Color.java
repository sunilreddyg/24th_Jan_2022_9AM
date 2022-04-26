package ui_verification_commands.getCssvalue;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Get_Object_Color_OR_BackGround_Color {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement BookADemo=driver.findElement(By.xpath("//a[@href='/hris-hr-software-demo/']"));
		String BGColor=BookADemo.getCssValue("background-color");
		System.out.println(BGColor);
		
		String ExpColor="#f68422";
		
		Color obj=Color.fromString(BGColor);
		//Convert To HEX using RGBA value
		String ActColor=obj.asHex();
		System.out.println(ActColor);
		
		if(ExpColor.equals(ActColor))
			System.out.println("Color is matching");
		else
			System.out.println("Color is mismatched");

	}

}
