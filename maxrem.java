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
		
		mergeSort(arr, 0, n-1);
		int last = arr[n-1];
		int lastsec= arr[n-2];
		for(int i=n-2;i>=0;i--)
		{
			if(arr[i] != last)
			{
				lastsec = arr[i];
				break;
			}
		}

		System.out.println(lastsec%last);

		
			
		
	
	}
	static void mergeSort(int arr[], int l, int r)
	{
		if(l<r)
		{
			int m = l+(r-l)/2; 
			mergeSort(arr, l, m);
			mergeSort(arr, m+1, r);
			merge(arr, l, m, r);
		}
	}
	static void merge(int arr[] , int l, int m, int r)
	{
	
		int n1 = m - l + 1;
		int n2 = r - m;

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

		int i=0,j=0;
		int k= l;
		
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
