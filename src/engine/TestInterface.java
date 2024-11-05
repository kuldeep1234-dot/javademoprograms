package engine;

public class TestInterface {

	public static void main(String[] args) {
		
		Engine objEngine = new Car();
		objEngine.startEngine();
		objEngine.fuelInsert();
		
	Engine obj1Engine = new Byke();
	obj1Engine.fuelInsert();
	
	Wheels obj2Wheel = new Car();
	obj2Wheel.NoofWheels();
	
	Wheels obj3Wheel= new Byke();
	obj3Wheel.NoofWheels();
		
		

	}

}
