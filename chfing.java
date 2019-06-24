import java.util.*;
import java.math.*;

class chfing
{
	public static void main(String args[])
	{
	
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int l=0;l<t;l++)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();

			int tastiness = k-1;
			int i = 2;

			int n1 = k;
			int n2 = k+n-1;
			int firstnum = n1;
			int secondnum = n2;
			while(true)
			{
				int temp = secondnum;
				firstnum = n1 * i;
				secondnum = n2 * i;

				if(firstnum - temp <= 0)
				{
					break;
				}
				else
				{
					
					tastiness = tastiness + (firstnum -temp-1);
				}
			
			}
		

			System.out.println(tastiness);
		
		}
	}

}
