package mq.java.methods.StaticMethods;

public class ClassB 
{
	
	static void methodC()
	{
		System.out.println("Method C Executed");
	}
	
	static void methodD()
	{
		System.out.println("Method D executed");
		
	}
	
	void methodE()
	{
		methodC();
	}
	

	public static void main(String[] args) 
	{
		/*
		 * Syntax to call static methods from same class
		 */
		methodC();
		methodD();
		
	}

}
