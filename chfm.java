import java.util.*;
import java.io.*;

class chfm 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();

		for(int k=0;k<t;k++)
		{
			
			int n = sc.nextInt();

			int arr[] = new int[n];
			float mean = 0;
			for(int i=0;i<n;i++)
			{

				arr[i] = sc.nextInt();
				mean = mean + arr[i];
			}

			mean = mean/n;
			float divisor = n-1;
			float ogmean = 0;
			int pos = 0;
			boolean flag = false;
			for(int i=0;i<n;i++)
			{
				float newmean = 0;
				for(int j=0;j<n;j++)
				{
					if(i==j)
					{
						continue;
					}
					else
					{
						newmean = newmean + arr[j];

					}
				}
				newmean = newmean / divisor;

				if(newmean == mean)
				{

					ogmean = newmean;
					if(flag)
					{
						if(i<pos)
						{
							pos = i;
						}
					}
					else
					{
						pos = i;
						flag = true;
					}
				}

			}

			boolean impossible = false;

			if(ogmean == 0 && pos == 0)
			{

				impossible = true;
				System.out.println("impossible");

			}
			else
			{

				System.out.println(pos+1);
			}


		}


		
	}

}
