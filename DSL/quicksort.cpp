#include<iostream>
using namespace std;

void swap(int* a , int* b)
{
    int temp = *a;
    *a = *b;
    *b = temp; 
}



int partition(int* arr, int low, int high)
{
    int pivot = arr[high];
    int i = low - 1;

    for(j=0;j<=high;j++)
    {
        if(arr[j] < pivot)
        {
            i++;
            swap(&arr[i], &arr[high]);
        }
    }
    swap(&arr[i+1], &arr[high]);
    retur(i+1);

}

void quick(int* arr, int low, int high)
{
    

}


int main()
{
    int arr[] = {5,4,3,2,1};
    quick(arr, 0, 4);

    return 0;
}