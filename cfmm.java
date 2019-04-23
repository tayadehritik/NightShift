import java.util.*;

class cfmm
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		char[] codechef = {'c','o','d','e','h','f'};
		for(int k=0;k<t;k++)
		{
			int lcount = 0;
			int n = sc.nextInt();
			StringBuffer sb = new StringBuffer("");
			for(int i=0;i<n;i++)
			{
				String s = sc.next();
				sb.append(s);
			
			}
			
			for(int i=0;i<sb.length();i++)
			{
				if(sb.charAt(i) == 'c')
				{
					lcount = lcount + 1;
				}
			}
			lcount = lcount / 2;
			
			for(int j=1;j<6;j++)
			{
				int ccount = 0;

				for(int i=0;i<sb.length();i++)
				{
					if(sb.charAt(i) == codechef[j])
					{
						ccount = ccount + 1;
					}	
				}
				if(codechef[j] == 'e')
				{
					ccount = ccount / 2;
				
				}

				if(ccount < lcount)
				{
					lcount = ccount;
				}
			}
			System.out.println(lcount);
		}
	}
}
