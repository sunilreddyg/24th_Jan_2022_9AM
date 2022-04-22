package mq.java.variables;

public class Variable_Static
{
	
	static int x=100;
	static boolean y=false;
	static String name="Mindq";

	public static void main(String[] args) {
		
		System.out.println(Variable_Static.x);
		System.out.println(Variable_Static.y);
		System.out.println(Variable_Static.name);
		
		String InstName=Variable_Static.name;
		System.out.println(InstName);

	}

}
