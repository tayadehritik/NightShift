import java.util.*;

class maxrem
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int j=0;j<n;j++)
		{
			arr[j] = sc.nextInt();
			
		}
		
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<i;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					for(int k=i;k>j;k--)
					{
						arr[k] = arr[k-1];
					}
					arr[j] = temp;
				}
			}
		}

		int ls = arr[n-2];
		int ma = arr[n-1];
		System.out.println(ls%ma);

		
			
		
	
	}

}
