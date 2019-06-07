import java.util.*;

class proxyc
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int l=0;l<t;l++)
		{
			int d = sc.nextInt();
			double k = d;
			char[] sarr = new char[d];
			String s = sc.next();
			s.getChars(0,s.length(),sarr,0);
			double currAttc = 0;
			for(int i=0;i<d;i++)
			{
				if(sarr[i] == 'P')
				{
					currAttc++;
					
				}
			}
			double currAtt = currAttc / k;

			
			int i = 2;
			int proxycounter = 0;
			while(currAtt<0.75 && i < d-2)
			{
				if((sarr[i-1] == 'P' || sarr[i-2] == 'P') && (sarr[i+1] == 'P' || sarr[i+2]=='P') && sarr[i] != 'P')
				{
					
					proxycounter++;
					currAttc++;
				
				}
		
				i++;
				currAtt = currAttc / k;
			
			}
			if(currAtt<0.75)
			{
				proxycounter = -1;
			}
			System.out.println(proxycounter);
		
		}
	
	}

}
