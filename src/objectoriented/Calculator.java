package objectoriented;

public class Calculator {
	
	int i;
	int j;
	
	public void sum()
	{
		System.out.println("Sum of two numbers  "+(i+j));
	}
	
	public void mul()
	{
		System.out.println("Mul of two numbers  "+(i*j));
	}
	public static void main(String[] args) {
	Calculator obj= new Calculator();
	obj.i=10;
	obj.j=20;
	obj.sum();
	obj.mul();
	
	Calculator obj1= new Calculator();
	obj1.i=30;
	obj1.j=40;
	
	obj1.mul();
	obj1.sum();

	}

}
