package framework.Junit4;

import org.junit.Ignore;
import org.junit.Test;

public class Junit_IgnoreMethod 
{
	

	@Test //Invoke method to run without object creation
	public void test1() 
	{
		System.out.println("test1 executed");
	}
	
	@Ignore  //Annotaiton ignore method execution
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
