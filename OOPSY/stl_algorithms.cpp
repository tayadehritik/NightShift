#include<iostream>
using namespace std;
#include<algorithm>
#include<vector>
 
int main()
{
    //binary search

    int a[8] = {1,2,3,4,5,6,7,8};
    int sort1[5] ={5,4,3,2,1};
    if(binary_search(a,a+8,5))
    {
        cout<<"found"<<5;
    }
    else
    {
        cout<<"not found";
    }
    
    sort(sort1, sort1+5);
    for(int i=0;i<5;i++)
    {
        cout<<sort1[i];
    }


    return 0;
}