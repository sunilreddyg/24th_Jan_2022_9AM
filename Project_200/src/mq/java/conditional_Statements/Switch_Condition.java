package mq.java.conditional_Statements;

public class Switch_Condition {

	public static void main(String[] args) 
	{
		
		//Multiple Decision to Execute
		
		String month="mar";
		
		switch (month) 
		{
		case "jan":
			System.out.println("10% Discount");
			break;
			
		case "feb":
			System.out.println("20% Discount");
			break;
			
		case "mar":
			System.out.println("30% Discount");
			break;

		default:System.out.println("No Discount");
			break;
		}

	}

}
