package mq.java.Arrays;

public class Single_Dimensional_Runtime_Array
{

	public static void main(String[] args) 
	{
		
		
		String names[]= {"Sam","aakash","ajay","abdul"};
		System.out.println(names[1]);
		
		//Runtime array with split method
		String browsers="chrome,firefox,Safari";
		String arr[]=browsers.split(",");
		System.out.println(arr[0]+"\t"+arr[1]+"\t"+arr[2]);
		
		//Store String characters into array
		String toolname="WebDriver";
		char ch[]=toolname.toCharArray();
		System.out.println(ch[8]);
		
		
		//Single Dimensional runtime array with numerics
		int num[]= {100,200,300,400,500};
		System.out.println("3rd index value is --> "+num[3]);
		
		
		
		
	}

}
