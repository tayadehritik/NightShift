import java.util.*;
import java.math.BigInteger;

class ks2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int l = 0;l<t;l++)
		{
			String ninput = sc.next();
			BigInteger n = new BigInteger(ninput);
			int n1 =  Integer.parseInt(ninput);
			int ans = 0;
			int counter = 0;
			BigInteger compare = new BigInteger("1000000");
			if(n.compareTo(compare) < 0 )
			{

				for(int i=10;i<1000000;i++)
				{
					String s = Integer.toString(i);
					char[] sarr = new char[s.length()];
					s.getChars(0,s.length(), sarr,0);
					int sum = 0;
					for(int j=0;j<s.length();j++)
					{
						sum = sum + Character.getNumericValue(sarr[j]);
					}
					if(sum%10 == 0)
					{
					
						counter++;
						System.out.println(i);
					}


					if(counter == n1)
					{
						ans = i;
						break;
					}
			
		
				}
				System.out.println(ans);
			}
			else
			{
			
			}

		}
	}

}
