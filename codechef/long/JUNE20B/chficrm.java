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
		register.put(5,0);
		register.put(10,0);
		register.put(15,0);	
		for(int i=0;i<n;i++)
		{
		
			register = putInRegister(register, arr[i]);
			//System.out.println(register);
			Integer change = calculateChange(arr[i]);
			if(change != 0)
			{
				boolean changeStatus = checkIfThereIsChangeInRegister(register,change);

				if(changeStatus == true)
				{
					register = removeFromRegister(register,change);	
				}
				else
				{
					register = removeFromRegister(register,arr[i]);
					flag = false;
					break;
				}
			}
					

			//System.out.println(returnMoney);
		
		}
		//System.out.println(register);

		if(flag == true)
		{
			return "YES";
		}
		else
		{
			return "NO";
		}

	}

	public static HashMap<Integer,Integer> putInRegister(HashMap<Integer,Integer> register, int cash)
	{
		
		if(register.containsKey(cash))
		{
			register.put(cash,register.get(cash)+1);	
		}
		else
		{
			register.put(cash,1);
		}	
	
		return register;
	}
	public static boolean checkIfThereIsChangeInRegister(HashMap<Integer,Integer> register, int change)
	{
			
		
		if(register.containsKey(change))
		{
						
			if(register.get(change) >= 1)
			{
				return true;
			}
			else
			{
				if(change == 10)
				{
					
					if(register.get(5) >= 2)
					{
						return true;
					}
					else
					{
					
						return false;
					}
				
				}
				else
				{
					return false;
				}
			
			}
		}
		else
		{
			return false;
		}
		
		
	}

	public static HashMap<Integer,Integer> removeFromRegister(HashMap<Integer,Integer> register, int cashToRemove)
	{
		if(register.get(cashToRemove)<1)
		{
			register.put(5,register.get(5)-2);
		}
		else
		{
			register.put(cashToRemove, register.get(cashToRemove)-1);
		}
		return register;
	}
	public static int calculateChange(int cash)
	{
		return cash-5;	
	}

}
