import java.util.*;

class strch
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int l = sc.nextInt();
			String a = sc.next();
			String k = sc.next();
			char ca = k.charAt(0);
			int count = 0;
			for(int o=0;o<l;o++)
			{
				if(a.charAt(o) == ca)
				{
					count = count + 1;
				}
			}


			for(int j=0;j<=l;j++)
			{
				for(int p=j;p<=l;p++)
				{
					String ss = a.substring(j,p);	
					
					if(ss.length() != 1 && ss.length() != 0)
					{
						
						if(ss.contains(k))
						{
							count = count + 1;
						}
					
					}
				}
			}
			System.out.println(count);

		}
	
	}

}
