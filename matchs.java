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
			while(bignum.compareTo(zero) > 0 && smallnum.compareTo(zero)>0)
			{
				if(bignum.compareTo(smallnum)<0)
				{
					BigInteger temp = smallnum;
					smallnum = bignum;
					bignum = temp;
				}

				try{
					bignum = bignum.mod(smallnum);
				}
				catch(ArithmeticException ae)
				{
					break;
				}

				player = player + 1;
				
				/*
				System.out.println("-----\n"+bignum+" "+smallnum);
				System.out.println(bignum+"\n-------\n");
			*/
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
