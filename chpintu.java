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
			
		

			for(int i=0;i<n;i++)
			{
				fruits[arrf[i]] = fruits[arrf[i]] + arrp[i];
			}		
			int smallest = fruits[1];
			if(smallest == 0)
			{
				int i = 2;
				while(smallest != 0)
				{
					smallest = fruits[i];
					i++;
				}
			}		

			for(int i=1;i<=m;i++)
			{
				if(fruits[i] < smallest && fruits[i] != 0)
				{
					smallest = fruits[i];
				}
			}

			System.out.println(smallest);
			
		}
	
	}

}
