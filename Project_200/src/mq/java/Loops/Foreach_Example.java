package mq.java.Loops;

public class Foreach_Example {

	public static void main(String[] args) {
		
		
		//Print array values
		String browsers[]= {"chrome","firefox","edge","safari","ie"};
		for (String eachbrowser : browsers) 
		{
			System.out.println(eachbrowser);
		}
		
		
		//Double Dimension array value
		String userdata[][]=
			{
					{"sam","9030248888"},
					{"rajesh","900248899"},
					{"sindhu","5214521452"},
					
			};
		
		
		for (String[] eachrow : userdata) 
		{
			System.out.println(eachrow[0]+"    "+eachrow[1]);
		}
		
		
		
	}

}
