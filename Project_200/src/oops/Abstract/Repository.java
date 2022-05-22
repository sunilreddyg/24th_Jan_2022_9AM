package oops.Abstract;

public abstract class Repository 
{
	//Method without body
	abstract void method1();
	abstract void method2();
	
	//Variables with static specifier
	static String name="MQ";
	
	//Method with Body
	void method3()
	{
		System.out.println("method3 Executed");
	}

}
