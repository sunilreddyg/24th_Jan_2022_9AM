package oops.Interface;

public class Runner {

	public static void main(String[] args) 
	{
		
		Book obj=new FirstEdition();
		obj.Title();
		obj.Author();
		
		
		Book ref=new SecondEdition();
		ref.Title();
		ref.Author();
		ref.method1();
		
		System.out.println(Book.publisher);
		
		
	}

}
