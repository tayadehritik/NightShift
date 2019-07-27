//TODO double for mean
import java.util.*;
import java.io.*;

class chfm 
{
	static double totalsum = 0;
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();

		while(t!=0)
		{
			int n = sc.nextInt();
			int[] arr = new int[n];
			fillArray(arr, sc);
			double Mean = returnOriginalMean(arr);
			int pos = positionToRemove(arr,Mean);

			if(pos<0)
			{
				System.out.println("Impossible");
			}
			else
			{
				System.out.println(pos+1);
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
		totalsum = meanBase;
		return mean;
	}
	static int positionToRemove(int[] arr, double Mean)
	{
		int pos = -1;
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
					flagforsmall = true;
				}
			}
		}
		return pos;
	}
	static double calculateMean(int pos, int[] arr)
	{
		double meanBase = 0;
		meanBase = totalsum - arr[pos];
		double mean = meanBase / (arr.length-1);
		return mean;
	}
	

}