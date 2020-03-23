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
			int[] tagged = new int[m+1];

			for(int i=0;i<n;i++)
			{
				arrf[i] = sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				int num = sc.nextInt();
				arrp[i] = num;
			}
			
			Set<Integer> tset = new HashSet();

			for(int i=0;i<n;i++)
			{
				fruits[arrf[i]] = fruits[arrf[i]] + arrp[i];
				tset.add(arrf[i]);
			}	

			int smallest = fruits[1];
			if(smallest == 0)
			{
				for(int i=2;smallest == 0 && i<=m;i++)
				{
					smallest = fruits[i];
				}
			}		
			
			Iterator<Integer> iterator = tset.iterator();
			while(iterator.hasNext())
			{
				int ele = iterator.next();
		
				if(fruits[ele] < smallest)
				{
					smallest = fruits[ele];
				}
			}	

			System.out.println(smallest);
			
		}
	
	}

}
