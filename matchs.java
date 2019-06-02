import java.util.*;
import java.lang.Math.*;
import java.math.BigInteger;
class matchs
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int l=0;l<t;l++)
		{
			String n1 = sc.next();
			String m1 = sc.next();
			BigInteger n = new BigInteger(n1);
			BigInteger m = new BigInteger(m1);
			int player = 0;
			BigInteger bignum;
			BigInteger smallnum;
			if(n.compareTo(m)> 0)
			{
				bignum = n;
				smallnum = m;
			}
			else
			{
				bignum = m;
				smallnum = n;
			}

			BigInteger zero = new BigInteger("0");	
			BigInteger x;
		
			if(bignum.mod(smallnum).compareTo(zero) == 0)
			{
				System.out.println("Ari");
			
			}
			else
			{
				while(bignum.compareTo(zero) != 0 && smallnum.compareTo(zero) != 0)
				{
					bignum = bignum.mod(smallnum);
					player = player + 1;

					if(bignum.compareTo(smallnum)<0)
					{
						BigInteger temp = smallnum;
						smallnum = bignum;
						bignum = temp;
					}

					System.out.println(bignum +"  "+ smallnum);
					
			
				}

				if(player % 2 == 0)
				{
					System.out.println("Rich");
				}
				else
				{
					System.out.println("Ari");
				}
			
			}



			
		

			
		}
	
	}

}
