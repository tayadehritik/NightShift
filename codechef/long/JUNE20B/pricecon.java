import java.util.*;

class pricecon
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int l=0;l<t;l++)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			int arr[] = new int[n];
			int InitialSum = 0;
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
				InitialSum = InitialSum + arr[i];
			}
			int sum = 0;
			for(int i=0;i<n;i++)
			{
				if(arr[i] > k)
				{
					sum = sum + k;
				}
				else
				{
					sum = sum + arr[i];
				}
			}

			System.out.println(InitialSum - sum);
		}
	}
}
