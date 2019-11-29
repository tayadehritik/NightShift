#include<iostream>
using namespace std;


int main()
{
    int arr[5] = {5,3,4,1,2};

    for(int i=0;i<5;i++)
    {
        for(int j=0;j<5;j++)
        {
             if(arr[i] < arr[j])
             {
                 int temp = arr[i];
                 for(int k = i; k >= j; k--)
                 {
                     arr[k] = arr[k-1];
                 }
                 arr[j] = temp;
             }
        }
    }


    cout<<endl;
    for(int i=0;i<5;i++)
    {
        cout<<arr[i];
    }

    return 0;
}