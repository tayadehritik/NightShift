#include<iostream>
using namespace std;
int main()
{
	int arr[5] = {5,4,3,1,2};

	for(int i=0;i<5;i++)
	{
		int m = arr[i];
		for(int j=i;j<5;j++)
		{
			if(arr[j]<arr[i])
			{
				int temp = arr[j];
				for(int k=j-1;k>=i;k--)
				{
					arr[k+1] = arr[k];
				}
				arr[i] = temp;
			}
		
		}
		
		
		

	}

	int arr1[5] = {5,4,3,1,2};

	for(int i=0;i<5;i++)
	{
		cout<<arr[i];
	}

	for(int gap = 5/2 ;gap>0;gap = gap/2)
	{

		for(int i=gap ;i<n;i++)
		{

			int temp = arr[i];
			int j;
			for(j=i;j>=gap&&arr[j-gap] > temp;j = j-gap)
			{
				arr[j] = arr[j-gap];
			
			}
			arr[j] = temp;
			
		}		

	}


	return 0;
}
