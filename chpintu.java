import java.util.*;
import java.lang.*;

class chpintu
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int k=0;k<t;k++)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] arrp = new int[n];
			int[] arrf = new int[n];
			int[] fruits = new int[m+1];
			for(int i=0;i<n;i++)
			{
				arrf[i] = sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				arrp[i] = sc.nextInt();
			}
			int count = 0;
			for(int i=0;i<n;i++)
			{
				fruits[arrf[i]] = fruits[arrf[i]] + arrp[i];
			}

			for(int i=0;i<fruits.length;i++)
			{
				System.out.println(i+" "+fruits[i]);
			}
		}
	
	}

}
