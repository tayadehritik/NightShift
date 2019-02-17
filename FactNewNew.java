import java.util.*;
import java.lang.*;
import java.math.BigInteger;
import java.lang.Math;
class FactNewNew 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		for(int i=0;i<num;i++)
		{
			int nnum = sc.nextInt();
			BigInteger fact = factorial(nnum);		
				
			String s = fact.toString();
			
			char[] arr = s.toCharArray();
			BigInteger counter = BigInteger.valueOf(0);
			for(int j=arr.length-1;j>=0;j--)
			{
				
				
				if(arr[j] != '0')
				{
					break;
				}
				else if(arr[j] == '0')
				{
					counter = counter.add(BigInteger.valueOf(1));
				}
			}
			
		}	
	}
	public static BigInteger factorial(int num)
	{
		BigInteger fact = BigInteger.valueOf(num);
		BigInteger tempfact = fact;
		if(num%2==0)
		{
			for(int i=num-2;i>1;i=i-2)
			{
			
				tempfact = tempfact.add(BigInteger.valueOf(i));
				fact = fact.multiply(tempfact);
				String fs = fact.toString();
				System.out.println(fs);
				System.out.println(i);
				System.out.println(fs.charAt(fs.length()-1));			
			}
			return fact;
		}
		else
		{
			BigInteger newfact = factorial(num-1);
			newfact = newfact.multiply(BigInteger.valueOf(num));
			
			return newfact;			
		
		}
	} 

	
}
