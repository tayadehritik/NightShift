import java.util.*;
class FactNew 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int inputn = sc.nextInt();
		
		for(int i=0;i<inputn;i++)
		{
			double fact = factorial(sc.nextInt());
			System.out.println(fact);
		}		
	}
	static double factorial(int input)
	{
	        double fact = input;
		for(int i=input-1;i>1;i--)
		{
			fact = fact * i;
		}
		return fact;
	}
}
