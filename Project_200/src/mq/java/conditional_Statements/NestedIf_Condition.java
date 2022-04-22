package mq.java.conditional_Statements;

public class NestedIf_Condition {

	public static void main(String[] args) 
	{
		
		
		
		int Age=10;
		boolean goodhealth=true;
		
		if (Age > 1) 
		{
			System.out.println("Age approved");
			
				if (goodhealth==true) 
				{
					System.out.println("Insurance accepted");
				} 
				else 
				{
					System.out.println("Insurance rejected");
				}
		}
		else
		{
			System.out.println("Under Age");
		}
		
		
		
	}

}
