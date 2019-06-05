import java.util.*;

class johny
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int l=0;l<t;l++)
		{
		
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			
			}
			int k = sc.nextInt();
			int key = arr[k-1];

			mergeSort(arr, 0, arr.length-1);

			int keypos = binSearch(arr, 0, arr.length-1, key);

			System.out.println(keypos+1);
		
		}
	
	
	}

	static void mergeSort(int[] arr, int l, int r)
	{
		if(l<r)
		{
			
			int m = (l+r)/2;
			mergeSort(arr, l, m);
			mergeSort(arr,m+1,r);
			merge(arr, l, m, r);
		
		}
	
	}
	static void merge(int[] arr, int l, int m, int r)
	{
		int n1 = m-l + 1;
		int n2 = r - m;

		int[] a1 = new int[n1];
		int[] a2 = new int[n2];

		for(int i=0;i<n1;i++)
		{
			a1[i] = arr[l+i];
		}
		for(int i=0;i<n2;i++)
		{
		
			a2[i] = arr[m+1+i];
		}
		int i, j, k;
		i = 0;
		j = 0;
		k = l;

		while(i<n1 && j<n2)
		{
			if(a1[i] < a2[j])
			{
				arr[k] = a1[i];
				i++;
			}
			else
			{
				arr[k] = a2[j];
				j++;
			}
			k++;
		
		}

		while(i<n1)
		{
			arr[k] = a1[i];
			i++;
			k++;
		}

		while(j<n2)
		{
			arr[k] = a2[j];
			j++;
			k++;
		}
	
	}
	static int binSearch(int[] arr, int l, int r, int key)
	{ 
	
		int m = (l+r)/2;

		if(key > arr[m])
		{
			l = m+1 ;
			return binSearch(arr, l, r, key);
		}
		else if(key < arr[m])
		{
			r = m-1;
			return binSearch(arr, l, r ,key);
		}
		else
		{
			return m;
		
		}
	
	}


}
