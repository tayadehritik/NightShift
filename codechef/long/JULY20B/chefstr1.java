import java.util.*;
import java.math.*;
import java.lang.*;

class chefstr1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int k=0;k<t;k++)
		{
			BigInteger sum = BigInteger.valueOf(0);
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
			for(int i=0;i<n-1;i++)
			{
				if(arr[i] > arr[i+1])
				{
					sum = sum.add(BigInteger.valueOf((arr[i] - arr[i+1]) - 1));
				}
				else
				{
					sum = sum.add( BigInteger.valueOf((arr[i+1] - arr[i]) - 1));
				}
			}
			System.out.println(sum);
		}
	
	}

}
