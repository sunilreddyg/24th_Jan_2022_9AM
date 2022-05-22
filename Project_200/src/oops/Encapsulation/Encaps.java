package oops.Encapsulation;

public class Encaps 
{
	public  String  EMPID="MQ001";
	private String name;
	private String email;
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		System.out.println(System.currentTimeMillis());
		this.name = name;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	
	
	
	
}
