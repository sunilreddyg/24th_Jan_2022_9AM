package mq.java.methods.parameters;

public class Product 
{
	
	public void name(String name)
	{
		System.out.println(name);
	}
	
	public void nameAndPrice(String name,double price)
	{
		System.out.println(name);
		System.out.println(price);
	}

	public static void main(String[] args) 
	{
		
		Product obj=new Product();
		obj.name("iphone");
		obj.nameAndPrice("iphone", 25000.00);

	}

}
