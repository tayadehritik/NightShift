import java.util.*;

class covid19
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int k=0;k<t;k++)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
			int minCase = personsInfectedByThatIndex(0,arr,n);
			int maxCase = personsInfectedByThatIndex(0,arr,n);

			for(int i=0;i<n;i++)
			{
				int num = personsInfectedByThatIndex(i,arr,n);
				if(num<minCase)
				{
					minCase = num;
				}
				
				if(num>maxCase)
				{
					maxCase = num;
				}

			}

			System.out.println(minCase+" "+maxCase);
		}
		
	}

	static int personsInfectedByThatIndex(int i,int[] arr,int n)
	{

		int infected = 1;
		
		boolean flag1 = false;
		boolean flag2 = false;

		for(int index = i;index < n-1 && flag1 == false;index++)
		{
			
			int difference = arr[index+1] - arr[index];
			if(difference <= 2)
			{
				infected = infected + 1;
			}
			else
			{
				flag1 = true;
			}
		}


		for(int index = i; index > 0 && flag2 == false; index--)
		{
			int difference = arr[index] - arr[index-1];
			if(difference <=2)
			{
				infected = infected + 1;
			}
			else
			{
				flag2 = true;
			}
		}
			

		return infected;
	}


}
