import java.util.*;

class MergeSort
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int[] arr = new int[l];
		for(int i=0;i<l;i++)
		{
			arr[i] = sc.nextInt();
		}
		mergeSort(arr,0,arr.length-1);
		for(int i=0;i<l;i++)
		{
			System.out.println(arr[i]);
		}

	
	}
	static void mergeSort(int[] arr, int l , int r)
	{
		if(l<r)
		{
			int m = (l+r)/2;
			mergeSort(arr, l, m);
			mergeSort(arr, m+1, r);
			merge(arr, l, m , r);
		}
	
	}
	static void merge(int[] arr, int l, int m, int r)
	{
	
		int i,j, k;
		
		int n1 = m-l+1;
		int n2 = r-m;

		int[] L = new int[n1];
		int[] R = new int[n2];

		for(int pi = 0; pi < n1 ; pi++)
		{
			L[pi] = arr[l+pi];
		}
		for(int pi = 0; pi < n2 ; pi++)
		{
			R[pi] = arr[m+1+pi];
		}

		i=0;
		j=0;
		k=l;
		while(i<n1 && j<n2)
		{
			if(L[i] <= R[j])
			{
				arr[k] = L[i];
				i++;
			}
			else
			{
				arr[k] = R[j];
				j++;
			}
			k++;
		
		}

		while(i<n1)
		{
			arr[k] = L[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k] = R[j];
			j++;
			k++;
		}



	}

}
