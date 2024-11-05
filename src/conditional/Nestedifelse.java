package conditional;

public class Nestedifelse {

	public static void main(String[] args) {
		int numb= 99999;
		{
		if (numb<100 && numb>=10)
		{
			System.out.println("Number is two digit ");
		}
		
		else if (numb<1000 && numb>=100)
		{
			System.out.println("Number is three digit ");
		}
		else if(numb<10000 && numb>=1000)
		{
			System.out.println("Number is four digit ");
		}
		else
		{
			System.out.println("Number not lies between 100 & 99999 ");
		}
		}
		

	}

}
