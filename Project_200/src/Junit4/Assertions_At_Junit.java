package framework.Junit4;

import org.junit.Assert;
import org.junit.Test;

public class Assertions_At_Junit
{
	
	@Test
	public void tc001()
	{
		Assert.assertEquals("gmail", "gmail");
		System.out.println("tcoo1 passed");
	}
	
	@Test
	public void tc002()
	{
		//Because of mismatch assert stop test ro run.
		Assert.assertEquals("yahoo", "yah");  
		System.out.println("tcoo2 passed");
	}
	
	@Test
	public void tc003()
	{
		Assert.assertTrue(true);
		System.out.println("tcoo3 passed");
	}
}
