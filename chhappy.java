import java.util.*;

class chhappy
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int size = sc.nextInt();
			int arr[] = new int[size];
			for(int j=0;j=size;j++)
			{
			
				arr[j] = sc.nextInt();
			}
			for(int j=0;j<size;j++)
			{	
			
				for(int k=0;k<size;k++)
				{
					if(k!=j)
					{
						if(arr[arr[j]] == arr[arr[k]])
						{
							System.out.println(arr[arr[j]] + " "+ arr[arr[k]]);	
							if(arr[j] != arr[k])
							{
								
							}

						}
					}
				}
			}
		}
	}
}
