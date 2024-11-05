package engine;

public class Byke implements Engine, Wheels
{
	public void fuelInsert()
	{
		System.out.println("Inserting a fuel");
	}
	public void startEngine()
	{
		System.out.println("Starting a Engine");
	}
	
	public void startGear()
	{
		System.out.println("Starting a gear");
	}
	@Override
	public void NoofWheels() {
	System.out.println(" No of Wheels are 2");
		
	}
	
	
}
