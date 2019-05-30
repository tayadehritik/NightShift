import java.util.*;
import java.math.BigInteger;

class redone
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n = sc.nextInt();
			int x = 1;
			boolean xflag = false;
			int lastx = 1;
			for(int j=1;j<n;j=j+2)
			{
				if(xflag)
				{
					x =  j + (j+1) + (j*(j+1)) ;
					lastx = lastx + x + (lastx*x);
				}
				else
				{
					x = j + (j+1) + (j* (j+1));
					xflag = true;
					lastx = x;
				
				}
			}
			BigInteger f = new BigInteger("10000000007");
			BigInteger l = BigInteger.valueOf(lastx);
			System.out.println(l.mod(f));
			
		}
	
	}
}
