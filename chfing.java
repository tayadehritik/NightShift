import java.util.*;
import java.math.*;

class chfing
{
	public static void main(String args[])
	{
	
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		BigInteger consta = new BigInteger("1000000007");
		for(int l=0;l<t;l++)
		{
			String nst = sc.next();
			String kst = sc.next();

			BigInteger n = new BigInteger(nst);
			BigInteger k = new BigInteger(kst);

			BigInteger tastiness = k.subtract(BigInteger.ONE);
			BigInteger i = new BigInteger("2");

			BigInteger n1 = k;
			BigInteger n2 = k.add(n).subtract(BigInteger.ONE);
			BigInteger firstnum = n1;
			BigInteger secondnum = n2;
			while(true)
			{
				BigInteger temp = secondnum;
				firstnum = n1.multiply(i);
				secondnum = n2.multiply(i);
				BigInteger diff = firstnum.subtract(temp);

				if(diff.compareTo(BigInteger.ZERO) <= 0) {
					break;
				}
				else
				{
					System.out.println(i);
					tastiness = (tastiness.add(firstnum.subtract(temp).subtract(BigInteger.ONE))).mod(consta);
				}
				i = i.add(BigInteger.ONE);
			
			}
		

			System.out.println(tastiness);
		
		}
	}

}
