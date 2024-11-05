package emplyoee;

public class EmplyoeeSalary extends Salary {

	@Override
	public void partpaysalary() {
	System.out.println("Part Emplyoee Salary is "+p*10000);
		
	}
	@Override
	public void fullpaysalary() {
		System.out.println("Full time employee salary is "+f*10000);
			
	}

	@Override
	public void contractpaysalary() {
		System.out.println("Emplyoee Salary of contract is  "+  "No of hrs*10000");
			}	

}
