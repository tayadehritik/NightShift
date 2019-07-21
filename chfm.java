//TODO double for mean : done
//TODO mergeSort : done
//TODO linearSearch
import java.util.*;
import java.io.*;

class chfm 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();

		while(t!=0)
		{
			int n = sc.nextInt();
			int[] arr = new int[n];
			int[] unsortedarr = new int[n];
			
			fillArray(arr, sc);
			for(int i=0;i<arr.length;i++)
			{
				unsortedarr[i] = arr[i];
			}

			mergeSort(0, arr.length-1, arr);
			double Mean = returnOriginalMean(arr);
			int ele = positionToRemove(arr,Mean);
			int pos = linearSearch(ele, unsortedarr);
			if(pos<0)
			{
				System.out.println("Impossible");
			}
			else
			{
				System.out.println(pos+1);
			}

			/*for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}*/

			t = t - 1;
		}

		sc.close();		


		
	}
	static void fillArray(int[] arr, Scanner sc)
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();

		}
	}
	static double returnOriginalMean(int[] arr)
	{
		double meanBase = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			meanBase = meanBase + arr[i]; 
		}
		double mean = meanBase / arr.length ;
		return mean;
	}
	static int positionToRemove(int[] arr, double Mean)
	{
		int pos = -1;
		int ele = 0;
		boolean flagforsmall = false;
		for(int i=0;i<arr.length;i++)
		{
			double tempMean = calculateMean(i,arr);
			//System.out.println(tempMean + " "+ Mean);
			if(tempMean == Mean)
			{
				if(flagforsmall)
				{
					if(arr[i]< arr[pos])
					{
						pos = i;
					}
				}
				else
				{
					pos = i;
					ele = arr[i];
					break;
					//flagforsmall = true;
				}
			}
		}
		return ele;
	}
	static double calculateMean(int pos, int[] arr)
	{
		double meanBase = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(i==pos)
			{
				continue;
			}
			else
			{
				meanBase = meanBase + arr[i];
			}

		}
		double mean = meanBase / (arr.length-1);
		return mean;
	}
	
	static void mergeSort(int l, int r, int[] arr)
	{
		if(l<r)
		{
			int m = (l+r)/2;
			mergeSort(l, m, arr);
			mergeSort(m+1, r, arr);
			merge(l,r,m, arr);
		}	
			
		
	}
	static void merge(int l, int r,int m, int[] arr)
	{
		int arr1len;
		int arr2len;
		arr1len = m-l+1;
		arr2len = r-m;

		int[] copy1 = new int[arr1len];
		int[] copy2 = new int[arr2len];

		for(int i=0;i<copy1.length;i++)
		{
			copy1[i] = arr[l+i];
		}
		for(int i=0;i<copy2.length;i++)
		{
			copy2[i] = arr[m+1+i];
		}
		int pointer1 = 0;
		int pointer2 = 0;
		int genpointer = l;
		while(pointer1 < arr1len && pointer2 < arr2len)
		{
			
			if(copy1[pointer1] < copy2[pointer2])
			{
				arr[genpointer] = copy1[pointer1];
				pointer1 = pointer1 + 1;

			}
			else
			{
				arr[genpointer] = copy2[pointer2];
				pointer2 = pointer2 + 1;
			}
			
			genpointer = genpointer + 1;
		}

		while(pointer1<arr1len)
		{
			arr[genpointer] = copy1[pointer1];
			pointer1 = pointer1 + 1;
			genpointer = genpointer + 1;

		}

		while(pointer2<arr2len)
		{
			arr[genpointer] = copy2[pointer2];
			pointer2 = pointer2 + 1;
			genpointer = genpointer + 1;
		}

				
		

	}
	static int linearSearch(int ele, int[] unsortedarr)
	{
		int pos = -1;
		for(int i=0;i<unsortedarr.length;i++)
		{
			if(ele == unsortedarr[i])
			{
				pos = i;
				break;
			}
		}
		return pos;
		
	}

}
