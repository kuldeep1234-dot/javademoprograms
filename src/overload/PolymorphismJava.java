package overload;

public class PolymorphismJava {

public void sum (int i, int j)
   {
  System.out.println("Sum of two numbers "+(i+j));
	}

public void sum (double d, double e, double f)
{
	System.out.println("Sum of three numbers "+(d+e+f));
}
public void sum (double i, double k)
{
	System.out.println("Sum of two double "+(i+k));
}

}
