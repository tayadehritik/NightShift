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
			
			int ans = 0;
			int counter = 0;
			BigInteger compare = new BigInteger("10");
			if(n.compareTo(compare) < 0 )
			{
				int n1 = Integer.parseInt(ninput);

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
				char[] sarr = new char[ninput.length()];
				
				ninput.getChars(0,ninput.length(),sarr,0);
				BigInteger sum = new BigInteger("0");
				BigInteger zero = new BigInteger("10");
				BigInteger actzero = new BigInteger("0");
				for(int j=0;j<ninput.length();j++)
				{
					BigInteger temp = new BigInteger(Character.toString(sarr[j]));
					sum = sum.add(temp);
				}
				BigInteger ed;	
				BigInteger uplimit = sum;
				BigInteger one = new BigInteger("1");
				while(uplimit.mod(zero).compareTo(actzero)!=0)
				{
					uplimit = uplimit.add(one);
					
				}	
					
			

				
				
				if((sum).compareTo(uplimit) > 0)
				{
					ed = sum.mod(zero);
				}
				else
				{
					ed = uplimit.subtract(sum);
				}
				
				String edstr = ed.toString();
				BigInteger ansog = new BigInteger(ninput+edstr);
				System.out.println(ansog);


			}

		}
	}

}
