import java.util.*;
import java.math.*;


class rsigns
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int laststart = 10;
		double counter2 = 1;
		BigInteger lint = new BigInteger("1000000007");
		int oglimit = 0;
		for(int l=0;l<t;l++)
		{
			//double k = sc.nextDouble();
			//int k = sc.nextInt();
			String k = sc.next();
			int consta =(int) Math.pow(10,9) + 7;
			int q = 1;
			if(q == 2)
			{
				BigInteger consta2 = new BigInteger("10000000007");
				BigInteger start = BigInteger.TEN;
				BigInteger k3 = new BigInteger(k);
				BigInteger i = BigInteger.ONE;
				//k3 = k3.subtract(BigInteger.ONE);
				while(i.equals(k3) == false)
				{
					start = (start.add(start)).mod(consta2);
					System.out.println(i.add(BigInteger.ONE)+" "+start);
					i = i.add(BigInteger.ONE);
				
				}
			}
			else
			{
				//k = k-1;
				BigInteger ten = new BigInteger("10");
				//double start = (Math.pow(2,k)*10)%consta;
				BigInteger start = new BigInteger("2");
				int kl = k.length()-1;
				BigInteger two = new BigInteger("2");
				BigInteger five = new BigInteger("5");
				BigInteger k1 = new BigInteger(k);
				k1 = k1.subtract(BigInteger.ONE);
				
				//if(k1.equals(BigInteger.ONE))
				//{
				//	System.out.println(10);
				//}	
				//else
				//{
				
					/*for(int i=3;i<=k;i++)
					{
						start = ((start.multiply(two))).mod(lint);
						//System.out.println(i+" "+start);
				
					}*/
					//BigInteger k1 = new BigInteger(k);

					BigInteger result = start.modPow(k1,lint);
					
				/*BigInteger i = BigInteger.ONE;
				BigInteger result = two;
				while(i.equals(k1) == false)
				{
					result = result.multiply(two);

					i = i.add(BigInteger.ONE);
					System.out.println(i.add(BigInteger.ONE)+" "+result);
				
				}	
				
				*/
				

				System.out.println(result.multiply(BigInteger.TEN).mod(lint));
						
					
				//}
				
		

			}
			
		}
	
	}
	static double consta2 =  Math.pow(10,9)+7;
	static double rec(double pos)
	{
		
		if(pos == 1)
		{
			return 10;
		}
		else
		{
			double someth =  rec(pos-1);
			return (someth + someth) % consta2;

		}
	}

}
