#include<iostream>
#include<fstream>
#include<stdlib.h>

using namespace std;

int main()
{
    ifstream in;
    char Data[80];
    in.open("hritik.txt");
    if(!in)
    {
        cerr<<"error";
        exit(1);
    }
    else
    {
        cout<<endl<<"Contents of file are"<<endl;
        while(in)
        {
            in.getline(Data, 80);
            cout<<endl<<Data;
        }
        in.close();
    }
    return 0;
}