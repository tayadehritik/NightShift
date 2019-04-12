import java.util.*;
import java.io.*;
import java.lang.Math;
class horses 
{

	public static void main(String args[])
	{
	
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{

			int n = sc.nextInt();
			int[] arr = new int[n+1];
			
			for(int j=0;j<n;j++)
			{
				arr[j] = sc.nextInt();
				
			}
			int minimum = Math.abs(arr[0]-arr[1]);
			for(int j=0;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					
					int diff = Math.abs(arr[j] - arr[k]);
						
					if(diff < minimum)
					{
						minimum = diff;
					}

				}
			}
			System.out.println(minimum);
			
		}


	
	}

}
