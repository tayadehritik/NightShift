import java.util.*;

class fence
{
	public static void main(String args[])
	{
	
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int p=0;p<t;p++)
		{
		
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int[] cpcellsn = new int[k];
			int[] cpcellsm = new int[k];
			int count = 0;
			int leastindex = 1;
			for(int i=0;i<k;i++)
			{
				cpcellsn[i] = sc.nextInt();
				cpcellsm[i] = sc.nextInt();	
			}

			mergeSort(cpcellsn, cpcellsm, 0, cpcellsn.length-1);
			
			for(int i=0;i<k;i++)
			{
				if(cpcellsn[i] == leastindex)
				{
					count = count + 1;
				}
				else if(cpcellsn[i] == n)
				{
					count = count + 1;
				}

				if(cpcellsm[i] == leastindex)
				{
					count = count + 1;
				}
				else if(cpcellsm[i] == m)
				{
					count = count + 1;
				}
			
			}

			System.out.println(count);	

		}
	
	}
	static void mergeSort(int[] arr,int[] temparr, int l, int r)
	{
			
		if(l<r)
		{
			int m = (l+r) / 2;

			mergeSort(arr,temparr, l, m);
			mergeSort(arr,temparr, m+1, r);
			merge(arr,temparr, l, m, r);
		}

	}
	static void merge(int[] arr,int[] temparr, int l, int m, int r)
	{
	
		int n1 = m - l + 1; 
		int n2 = r - m;

		int[] L = new int[n1];
		int[] R = new int[n2];
		int[] Lt = new int[n1];
		int[] Rt = new int[n2];

		for(int p=0;p<n1;p++)
		{
			L[p] = arr[l+p];
		}
		for(int p=0;p<n2;p++)
		{
			R[p] = arr[m+1+p];
		}
		for(int p=0;p<n1;p++)
		{
			Lt[p] = temparr[l+p];
		}
		for(int p=0;p<n2;p++)
		{
			Rt[p] = temparr[m+1+p];
		}


		int i=0;
		int j=0;
		int k = l;

		while(i<n1 && j<n2)
		{
			if(L[i] <= R[j])
			{
				arr[k] = L[i];
				temparr[k] = Lt[i];
				i++;
			}
			else
			{
				arr[k] = R[j];
				temparr[k] = Rt[j];
				j++;
			}
			k++;
		
		}

		while(i<n1)
		{
			arr[k] = L[i];
			temparr[k] = Lt[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k] = R[j];
			temparr[k] = Rt[j];
			j++;
			k++;
		}
	
	}

}
