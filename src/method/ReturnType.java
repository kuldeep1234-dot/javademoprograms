package method;

public class ReturnType {

	public static int mult(int i, int j, int k)
	
	{
		int mul= i*j*k;
		return mul;
	}
	public static int add (int a, int b)
	{
	 int sum =a+b;
	 return sum;
	}
	
	public static void main(String[] args) {
	
		int returnvalue= mult(10,20,30);
		System.out.println("Value of mul method "+returnvalue);
		
		int returnvalue1= add(10,20);
		System.out.println("Value of mul method "+returnvalue1);
		

	}

}
