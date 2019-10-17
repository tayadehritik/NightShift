/* Write a function template selection sort, write a program that inputs, sorts and outputs an inter array and a float array.
 * outcomes:
 * 1. Students will be able to learn and understand working and user of function template
 * 2. Students will be able to demonstrate function template for selection sort.
 */

#include<iostream>
using namespace std;

template<class T> void selectionsor(T *arr, int size)
{
    int min;
    for(int i=0;i<size;i++)
    {
        min = i;
        for(int j=0;j<size;j++)
        {
            if(arr[j] > min)
            {
                T temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }



}

int main()
{

    int arr1[10] = {10,9,8,7,6,5,4,3,2,1};
    float arr2[10] = {10.11, 10.2, 9.3, 8.2, 7.55, 6.4, 5.2, 3.4, 2.2,1.1};

    selectionsor(arr1, 10);
    selectionsor(arr2, 10);

    for(int i=0;i<10;i++)
    {
        cout<<arr1[i]<<endl;
    }
    cout<<endl;

    for(int i=0;i<10;i++)
    {
        cout<<arr2[i]<<endl;
    }

    return 0;
}
