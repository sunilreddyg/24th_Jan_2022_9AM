package oops.Abstract;

public class Run_AbstarctMethods 
{

	public static void main(String[] args) 
	{
		 Repository obj=new TestB();
		 obj.method1();
		 obj.method2();
		 obj.method3();
		 
		 Repository ref=new TestA();
		 ref.method1();
		 ref.method2();
		 ref.method3();
		 
		 //Static methods calling from abstarct class
		 System.out.println(Repository.name);
		
		

	}

}
