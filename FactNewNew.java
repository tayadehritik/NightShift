import java.util.*;
import java.lang.*;
import java.math.BigInteger;
public class FactNewNew 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		for(int i=0;i<num;i++)
		{
			
			BigInteger fact = factorial(sc.nextInt());		
			
			String s = fact.toString();
			
			char[] arr = s.toCharArray();
			BigInteger counter = BigInteger.valueOf(0);
			for(int j=arr.length-1;j>=0;j--)
			{
				System.out.println("in check");
				
				if(arr[j] != '0')
				{
					break;
				}
				else if(arr[j] == '0')
				{
					counter = counter.add(BigInteger.valueOf(1));
				}
			}
			System.out.println(counter);
		}	
	}
	public static BigInteger factorial(int num)
	{
		BigInteger fact = BigInteger.valueOf(num);
		for(int i=num-1;i>1;i--)
		{
			System.out.println("in fact");
			fact = fact.multiply(BigInteger.valueOf(i));
		
		}
		return fact;
	
	}
}
