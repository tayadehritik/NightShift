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