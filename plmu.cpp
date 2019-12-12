#include<iostream>
using namespace std;

int main()
{
	int n;
	cin>>n;
	for(int i=0;i<n;i++)
	{
		int pairs=0;
		int length;
		cin>>length;
		int arr[length];
		for(int j=0;j<length;j++)
		{
			cin>>arr[j];
		}

		for(int j=0;j<length;j++)
		{
			for(int k=0;k<length;k++)
			{
				int addition, multiplication;
				addition  = arr[j] + arr[k];
				multiplication = arr[j] * arr[k];
				
			}
		}
		cout<<pairs/2;
		
	}
	return 0;
}
