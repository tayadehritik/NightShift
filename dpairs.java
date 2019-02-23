import java.util.*;

class dpairs 
{

	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		StringBuilder s = new StringBuilder();	
		int n = sc.nextInt();
		int m = sc.nextInt();
		int m2 = m;
		int arr[] = new int[n*m2];	
		m = m - 1;
		int n1[] = new int[n];
		int m1[] = new int[m2];
		
		for(int i=0;i<n;i++)
		{
			n1[i] = sc.nextInt();
			
		}
		for(int i=0;i<m+1;i++)
		{
			m1[i] = sc.nextInt();
		
		}
		int count = 0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m2;j++)
			{
				arr.add(n1[i] + m1[j]);
			
				
			}
		}
		System.out.println(arr);	
			

	}
	

}
