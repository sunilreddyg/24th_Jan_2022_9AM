package mq.java.Loops;

public class For_loop_Example 
{

	public static void main(String[] args) 
	{
	
		
		//Print Numbers from 1 to 10
		for (int i = 1; i < 11; i++) 
		{
			System.out.println(i);
		}
		
		
		//Print Numbers from 10 to 1
		for (int i = 10; i > 0; i--) 
		{
			System.out.println(i);
		}
		
		
		//Print array values
		String browsers[]= {"chrome","firefox","edge","safari","ie"};
		for (int i = 0; i < browsers.length; i++) 
		{
			String eachbrowser = browsers[i];
			System.out.println(eachbrowser);
		}
		
		
		//Conduct sum between 1 to 100
		int sum=0;
		for (int i = 1; i <= 100; i++) 
		{
			sum=sum+i;
		}
		System.out.println(sum);
		

		
		//Revers a string
		String toolname="webdriver";
		char ch[]=toolname.toCharArray();
		
		String str ="";
		for (int i = ch.length-1; i >= 0 ; i--) 
		{
			str=str+ch[i];
		}
		System.out.println(str);
		
		
		//Revers a string using String Builder
		StringBuilder build=new StringBuilder("webdriver");
		System.out.println(build.reverse());
		
		
		
		
	}

}
