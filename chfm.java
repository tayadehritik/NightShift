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
			fillArray(arr, sc);
			float ogMean = returnOriginalMean(arr);
			System.out.println(ogMean);

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
	static float returnOriginalMean(int[] arr)
	{
		float meanBase = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			meanBase = meanBase + arr[i]; 
		}
		float mean = meanBase / arr.length ;
		return mean;
	}

}
