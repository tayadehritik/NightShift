#include<iostream>
using namespace std;


int main()
{
	int arr[6] = {6,5,4,3,2,1};

	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			if(arr[j+1]<arr[j])
			{

				int temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp;
			}
		}
	}

	int arr1[6] = {12,11,10,9,8,7};

	for(int i=0;i<6;i++)
	{
		cout<<arr[i];

	}
	cout<<endl;

	for(int i=0;i<6;i++)
	{
		int m = arr1[i];
		for(int j=i;j<6;j++)
		{
			if(arr[j] < m)
			{
				int temp = arr1[i];
				arr1[i] = arr1[j];
				arr1[j] = temp;
			}
		
		}
	}
	for(int i=0;i<6;i++)
	{
		cout<<arr1[i];
	}
	
	return 0;
}
