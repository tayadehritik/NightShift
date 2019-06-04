import java.util.*;

class cleanup
{
	public static void main(String args[])
	{
		int[] arr = {4,2,3,1,6};
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int k=0;k<t;k++)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] cjobs = new int[m];
			int[] tjobs = new int[n-m];

			for(int i=0;i<m;i++)
			{
				cjobs[i] = sc.nextInt();

			}
			mergeSort(cjobs,0,cjobs.length-1);
			int counter = 0;
			int tcounter = 0;
			for(int i=1;i<=n;i++)
			{
				if(counter!=m)
				{
					if(i!=cjobs[counter])
					{
						tjobs[tcounter] = i;
						tcounter++;
					}
					else
					{
						counter++;
					}
				}
				else
				{
				
					tjobs[tcounter] = i;
					tcounter++;
				}
			
			
			}

			for(int i=0;i<(n-m);i++)
			{
				if(i%2==0)
				{
					System.out.print(tjobs[i]+" ");
				}
			}
			System.out.print("\n");
			for(int i=0;i<(n-m);i++)
			{
				if(i%2!=0)
				{
					System.out.print(tjobs[i]+" :");
				}
			}
			System.out.print("\n");

		
		}

	
	}
	static void mergeSort(int[] arr, int l, int r)
	{
		if(l<r)
		{
			int m = (l+r)/2;
			mergeSort(arr,l, m);
			mergeSort(arr, m+1,r);
			merge(arr,l,m,r);
		
		
		}
		
	}
	static void merge(int[] arr, int l, int m, int r)
	{

		int n1 = m - l + 1;
		int n2 = r - m;		

		int[] a1 = new int[n1];
		int[] a2 = new int[n2];


		for(int i=0;i<n1;i++)
		{
		
			a1[i] = arr[l+i];
		
		}
		for(int i=0;i<n2;i++)
		{
		
			a2[i] = arr[m+i+1];
		}

		int i,j,k;

		i=0;
		j=0;
		k = l;

		while(i<n1&&j<n2)
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
		while(i<n2)
		{
			arr[k] = a2[j];
			j++;
			k++;
		}
	}


}
