package framework.Junit4;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_WebDriver_Testcase 
{
	//This syntax helps to retrieve current constructed @Test method name.
	@Rule public TestName test=new TestName();
	
	
	
	@Test
	public void Verify_Singup_link_at_Footer()
	{
		driver.findElement(By.xpath("//a[@title='Log in to Facebook']")).click();
		Assert.assertEquals("Log in to Facebook | Facebook", driver.getTitle());
	}
	
	@Test
	public void Verify_Messenger_link_at_Footer()
	{
		driver.findElement(By.xpath("//a[contains(.,'Messenger')]")).click();
		Assert.assertEquals("Messenger", driver.getTitle());
	}
	
	@Test
	public void Verify_Games_link_at_Footer()
	{
		driver.findElement(By.xpath("//a[contains(.,'Games')]")).click();
		Assert.assertEquals("Games", driver.getTitle());
	}
	

	@Before
	public void setUp() throws Exception 
	{
		driver.get("http://facebook.com");
	}

	@After
	public void tearDown() throws Exception 
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens\\"+test.getMethodName()+".png"));
	}


	
	static WebDriver driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();
	}
}
