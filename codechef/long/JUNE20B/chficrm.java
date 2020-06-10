import java.util.*;

class chficrm
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
			String status = getAnswer(arr,n);
			System.out.println(status);
		
		}

	
	}
	public static String getAnswer(int[] arr, int n)
	{
		int currentDeposit = 0;
		HashMap<Integer, Integer> register = new HashMap<>();
		boolean flag = true;	
		for(int i=0;i<n;i++)
		{
		
			if(register.containsKey(arr[i]))
			{
				Integer val = register.get(arr[i]);
				register.put(arr[i],val+1);
			}
			else
			{
				register.put(arr[i],1);
			}


			int returnMoney = arr[i] - 5;

			if(returnMoney != 0)
			{
				if(register.containsKey(returnMoney) == false)
				{
					flag = false;
					break;
				}
				else
				{
					if(register.get(returnMoney) == 0)
					{
						flag = false;
						break;
					}
					else
					{
						Integer newVal = register.get(returnMoney);
						register.put(returnMoney, newVal-1);
					}
				
				}
			}

		
		}
				
		if(flag == true)
		{
			return "YES";
		}
		else
		{
			return "NO";
		}

	}
}
