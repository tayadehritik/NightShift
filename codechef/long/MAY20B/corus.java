import java.util.*;

class corus
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int k=0;k<t;k++)
		{
			int n = sc.nextInt();
			int q = sc.nextInt();
			sc.nextLine();
			String s = sc.nextLine();
			int IsolationCenters[] = new int[q];
			for(int i=0;i<q;i++)
			{
				IsolationCenters[i] = sc.nextInt();
				int num = pendingQueueNumber(IsolationCenters[i],s,n);
				System.out.println(num);
			}
		}
	
	}

	static int pendingQueueNumber(int IsolationCenters,String Cases, int NumberOfCases)
	{
		Dictionary CasesAndNumbers = getAllTypesOfCasesAndTheirNumbers(Cases,NumberOfCases);
		
		int pendingCases = 0;		
	
		for(Enumeration i = CasesAndNumbers.elements(); i.hasMoreElements();) 
        	{ 
           		
			int temp = (int) i.nextElement();
			if(temp > IsolationCenters)
			{
				pendingCases = pendingCases + (temp - IsolationCenters);
			}	
        	} 

		return pendingCases;
	}

	static Dictionary getAllTypesOfCasesAndTheirNumbers(String Cases,int NumberOfCases)
	{
		Dictionary CasesAndNumbers = new Hashtable();

		for(int i=0;i<NumberOfCases;i++)
		{
		
			/*CasesAndNumbers.put(Cases.charAt(i),1);*/
			if(CasesAndNumbers.get(Cases.charAt(i)) == null)
			{
				CasesAndNumbers.put(Cases.charAt(i),1);
			}
			else
			{
				int temp =(int) CasesAndNumbers.get(Cases.charAt(i));
				CasesAndNumbers.put(Cases.charAt(i),temp+1);
			}
		}


		return CasesAndNumbers;
	}

}
