/*
An m x n matrix is said to have a saddle point if some entry a[i][j] is the smallest value in
row i and the largest value in j. Write C/ C++ function that determines the location of a saddle point if one exists.
*/
#include<iostream>
using namespace std;

class saddlepoint
{
    private:
            int arr[20][20];
            int m,n;

    public:
            void saddle();
            void accept();
            void display();
};

void saddlepoint::saddle()
{
    int rows[m];
    int columns[n];

    for(int i=0;i<m;i++)
    {
        int smallest = arr[i][0];
        for(int j=0;j<n;j++)
        {
            if(arr[i][j] < smallest)
            {
                smallest = arr[i][j];
            }
        }
        rows[i] = smallest;
    }

    for(int i=0;i<n;i++)
    {
        int largest = arr[0][i];
        for(int j=0;j<m;j++)
        {
            if(arr[j][i]>largest)
            {
                largest = arr[j][i];
            }
        }
        columns[i] = largest;
    }
    

    cout<<endl;
    for(int i=0;i<m;i++)
    {
        cout<<rows[i]<<" ";
    }

    cout<<endl;
    for(int i=0;i<n;i++)
    {
        cout<<columns[i]<<" ";
    }



    for(int i=0;i<m;i++)
    {
        for( int j=0;j<n;j++)
        {
            if(rows[i] == columns[j])
            {
                cout<<"Saddle point found "<<rows[i]<<endl;
            }
        }
    }
    

}
void saddlepoint::accept()
{
    
    cout<<"Enter m and n"<<endl;
    cin>>m>>n;
    cout<<"Enter "<<m<<"x"<<n<<" array";
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            cin>>arr[i][j];
        }
    }
    
}
void saddlepoint::display()
{
    cout<<endl<<"*** Displaying matrix ***";
    for(int i=0;i<m;i++)
    {
        cout<<endl;
        for(int j=0;j<n;j++)
        {
            cout<<"\t"<<arr[i][j];
        }
        
    }
    cout<<endl; 
}

int main()
{
    saddlepoint sdp;
    sdp.accept();
    sdp.saddle();
    sdp.display();
    return 0;
}