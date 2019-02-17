import java.util.*;
class hs08test 
{
	public static void main(String args[])
	{
	
		Scanner sc = new Scanner(System.in);
		int transamt = sc.nextInt();
		double bal = sc.nextDouble();
		double tax = 0.50;
		if(transamt%5==0 && transamt+tax < bal)
		{
			double num = transamt + tax;
			System.out.format("%.2f",bal-num);	
		}
	}

}
