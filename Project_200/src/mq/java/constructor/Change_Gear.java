package mq.java.constructor;


public class Change_Gear 
{
	//constructor
	public Change_Gear() 
	{
		System.out.println("Hold Clutch");
	}
	
	//Reusable method
	public void Gear1()
	{
		System.out.println("First gear changed");
	}
	
	//Reusable method
	public void Gear2()
	{
		System.out.println("Second gear changed");
	}
	
	//Reusable method
	public void Gear3()
	{
		System.out.println("third gear changed");
	}


	//Main method [Runnable]
	public static void main(String[] args) 
	{
		new Change_Gear().Gear1();
		new Change_Gear().Gear2();
		new Change_Gear().Gear3();
	}


}
