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
				String[] seqb = new String[n];
				for(int j=0;j<n;j++)
				{
					int temp = seqp[j] ^ queries[i];
					seqb[j] = Integer.toBinaryString(temp);
				}
				int even = 0;
				int odd = 0;
				for(int j=0;j<n;j++)
				{
					
					int numberof1 = 0;
					for(int k=0;k<seqb[j].length();k++)
					{
						if(seqb[j].charAt(k) == '1')
						{
							numberof1 = numberof1 + 1;
						}
					}
					if(numberof1 % 2 == 0)
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

}
