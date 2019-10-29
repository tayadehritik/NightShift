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

	for(int i=0;i<5;i++)
	{
		cout<<arr[i];
	}

	return 0;
}
