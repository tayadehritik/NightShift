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
		mergeSort(arr,0,arr.length);

	
	}
	static void mergeSort(int[] arr, int l , int r)
	{
		int m = (l+r)/2;
		System.out.println(m);
	
	
	}
	static void merge(int[] arr, int l, int m, int r)
	{
	
	}

}
