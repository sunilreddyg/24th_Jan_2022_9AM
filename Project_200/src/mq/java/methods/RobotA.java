package mq.java.methods;

public class RobotA 
{
	
	public void turnON()
	{
		System.out.println("Robot is ON");
	}
	
	public void turnOFF()
	{
		System.out.println("Robot is OFF");
	}
	
	public void StartWalk()
	{
		System.out.println("Robot is Walking");
	}
	
	public void StopWalk()
	{
		System.out.println("Robot is Stopped");
	}

	public static void main(String args[])
	{
		new RobotA().turnON();
		new RobotA().turnOFF();
	}
	
}
