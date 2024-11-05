package emplyoee;

public abstract class Salary {
	int hrs,p=4,f=8;
	
	public abstract void partpaysalary();
	public abstract void fullpaysalary();
	public abstract void contractpaysalary();
	public static void partpaybonus() {
	}
	
	{
		System.out.println("Bonus for partime is 5000");
	}
	public static void contractpaybonus()
{
System.out.println("Bonus for contract is 5000");		
}

public static void fulltimepaybonus()
{
	System.out.println("Bonus for fulltimeemplyoee is 5000 ");
}
}