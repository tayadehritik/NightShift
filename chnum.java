import java.util.*;

class chnum 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			int pos=0;
			int neg=0;
			for(int j=0;j<n;j++)
			{
				int val = sc.nextInt();
				if( val >= 0)
				{
					pos = pos + 1;
				}
				else if (val < 0)
				{
					neg = neg + 1;
				}
			}

			if(neg == 0)
			{
				neg = pos;
				
			}
			else if(pos == 0)
			{
				pos = neg;
				
			}

			System.out.println(pos+" "+neg);
		}	
	
	}

}
