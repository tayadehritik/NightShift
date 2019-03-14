import java.util.*;

class chserve 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int p1 = sc.nextInt();
			int p2 = sc.nextInt();
			boolean p1c = true;
			boolean p2c = false;
			int k = sc.nextInt();
			String currval = "CHEF";
		
			for(int l=0;l<k;l++,p1++,p2++)
			{
				if(p1%k==0)
				{
					currval = "COOK";	
				}
				
			}
			System.out.println(currval);
		
		}
	
	}

}
