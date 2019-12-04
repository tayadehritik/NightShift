#include<iostream>
using namespace std;

template<class T>
void linsearch(T a,T *arr)
{
    for(int i=0;i<5;i++)
    {
        if(a == arr[i])
        {
            cout<<"found"<<arr[i];
        }
    }
}

int main()
{
    int arr1[] = {1,2,3,4,5};
    linsearch(5,arr1);
    double arr2[] = {1,2,3,4,5};
    double a = 2;
    linsearch(a, arr2);

    


    return 0;
}