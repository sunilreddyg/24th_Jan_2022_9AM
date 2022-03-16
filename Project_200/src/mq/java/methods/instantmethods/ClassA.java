package mq.java.methods.instantmethods;

public class ClassA 
{
	
	//Instant Method
	public void methodA()
	{
		System.out.println("Method A Executed");
	}
	
	//Instant method
	public void methodB()
	{
		methodA();
		System.out.println("method B Executed");
	}
	
	public static void main(String[] args) 
	{
		
		/*
		 * Creating object for class
		 * 		ClassName obj=new ClassName();
		 * 		obj.methodname();
		 */
		
		ClassA ref=new ClassA();
		ref.methodB();

	}

	
}
