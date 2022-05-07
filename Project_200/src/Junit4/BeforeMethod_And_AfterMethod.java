package framework.Junit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BeforeMethod_And_AfterMethod 
{

	@Before //Invoke every @Test annotation method before.
	public void setUp() throws Exception 
	{
		System.out.println("Pre_condition");
	}

	@After//Invoke after every @Test annotaion method.
	public void tearDown() throws Exception 
	{
		System.out.println("post-condition"+"\n");
	}
	
	
	@Test //Invoke method to run without object creation
	public void test1() 
	{
		System.out.println("test1 executed");
	}
	
	@Test//Invoke method to run without object creation
	public void test2() 
	{
		System.out.println("test2 executed");
	}

	@Test//Invoke method to run without obejct creation
	public void test3() 
	{
		System.out.println("test3 executed");
	}

	
}
