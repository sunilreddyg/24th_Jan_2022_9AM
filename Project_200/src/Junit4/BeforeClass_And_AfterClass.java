package framework.Junit4;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeClass_And_AfterClass 
{

	

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
	
	
	/*
	 * BeforeClass And AfterClass annotated method created with static
	 * access speicifier. So that we must reuse only static specifier
	 * methods and variable
	 */
	
	
	@BeforeClass //Invoke before execution of first @Test annotation
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("Precondition-for-class");
	}

	@AfterClass //Invoke after last @Test execution with in class
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("post-condition-for class");
	}

}
