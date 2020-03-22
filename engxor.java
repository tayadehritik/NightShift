import java.util.*;
import java.lang.*;

class engxor
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int l=0;l<t;l++)
		{
			int n = sc.nextInt();
			int q = sc.nextInt();
			int[] seqp = new int[n];
			int[] queries = new int[q];
			for(int i=0;i<n;i++)
			{
				seqp[i] = sc.nextInt();
			}	
			for(int i=0;i<q;i++)
			{
				queries[i] = sc.nextInt();
			}
			//slow solution
			for(int i=0;i<q;i++)
			{
				int[] seqb = new int[n];
				for(int j=0;j<n;j++)
				{
					int temp = seqp[j] ^ queries[i];
					seqb[j] = temp;
				}
				int even = 0;
				int odd = 0;
				for(int j=0;j<n;j++)
				{
					
					
				
					if(findPar(seqb[j]))
					{
						even = even + 1;
					}
					else
					{
						odd = odd + 1;
					}
				}
				System.out.println(even+" "+odd);
			}

		}
	
	}
	static boolean findPar(int num)
	{
		int y = num ^ (num << 1);
		y = y ^ ( y << 2);
		y = y ^ ( y << 4);
		y = y ^ ( y << 8);
		y = y ^ ( y << 16);

		if((y & 1) >0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
