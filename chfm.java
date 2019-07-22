//TODO double for mean : done
//TODO mergeSort : done
//TODO linearSearch : done
//TODO binaryMeanSearch : done
//TODO main login proble : multiple elements with same mean( finding the smallest is not done )
import java.util.*;

import javax.lang.model.util.ElementScanner6;

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
			fillArray(arr, sc);
			int[] unsarr = arr;
			double Mean = returnOriginalMean(arr);
			int l = 0;
			int r = arr.length-1;
			mergeSort(l, r, arr);

			int ele = binarySearch(l, r, Mean, arr);

			if(ele<0)
			{
				System.out.println("Impossible");
			}
			else
			{
				int actpos = linearSearch(arr[ele], unsarr);
				System.out.println(actpos+1);
			}
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
	//static boolean smallesteleflag = false;
	//static int smallest = 0;
	static int binarySearch(int l, int r, double Mean , int[] arr)
	{
		
		if(l<=r)
		{
			int m = (l+r)/2;
			double compmean = calculateMean(m, arr);
			//System.out.println(compmean + " "+ Mean);
			
			if(compmean == Mean)
			{
				//return m;
				int retpos = goLeft(m, arr, Mean);
				if(retpos < 0)
				{
					return m;
				}
				else
				{
					return retpos;
				}
				
			}
			else if(compmean > Mean)
			{
				l = m+1;
				return binarySearch(l, r, Mean, arr);
			}
			else
			{
				r = m-1;
				return binarySearch(l, r, Mean, arr);
			}
			
		}
		else
		{
			return -10;
		}
	}
	static double calculateMean(int pos, int[] arr)
	{
		double baseMean = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(pos == i)
			{
				continue;

			}
			else
			{
				baseMean = baseMean + arr[i];
			}
		}
		double actMean = baseMean/(arr.length-1);
		return actMean;
	}
	static int linearSearch(int key, int[] arr)
	{
		int pos = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == key)
			{
				pos = i;
				break;
			}
		}
		return pos;
	}

	static int goLeft(int pos, int[] arr, double key)
	{
		if(pos != 0)
		{
			int retpos = pos;
			int counter = pos-1;
			while(counter>=0)
			{
				double cmean = calculateMean(counter, arr);
				if(cmean == key)
				{
					retpos = counter;
					counter = counter - 1;
				}
				else
				{
					break;
				}
			}
			return retpos;
		}
		else
		{
			return -1;
		}

	}


}
