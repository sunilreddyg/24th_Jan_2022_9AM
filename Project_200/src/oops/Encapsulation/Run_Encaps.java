package oops.Encapsulation;

public class Run_Encaps {

	public static void main(String[] args) {
		
		
		Encaps obj=new Encaps();
		
		
		obj.setName("Vijay");
		String NewName=obj.getName();
		System.out.println(NewName);
		
		
		obj.setEmail("Vijay@gmail.com");
		System.out.println(obj.getEmail());
		
		//Changing Variable value at runtime
		System.out.println(obj.EMPID="MQ002");

	}

}
