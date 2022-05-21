package oops.Polymorphism.Overriding;


public class Circle extends Shape
{
	
	public void draw()
	{
		System.out.println("Circel Child  Class Method");
	}

	public static void main(String[] args) 
	{
		
		Circle obj=new Circle();
		obj.draw();
		
		Shape obj1=new Circle();
		obj1.draw();
		
		Shape obj2=new Shape();
		obj2.draw();
	
	}

}
