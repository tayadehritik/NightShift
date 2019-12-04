#include<iostream>
#include<fstream>
#include<cstring>
using namespace std;

int main()
{

    ifstream inobj;
    int lines;
    int words;
    int characters;

    char Data[80];
    inobj.open("hritik.txt");
    if(!inobj)
    {
        cout<<"error";
    }
    else
    {

        //inobj.read((char *)&Data, sizeof(Data));
        cout<<Data;

        while(inobj)
        {
            inobj.getline(Data, 80);
            int n = strlen(Data);
            lines++;
            characters = characters + n;
            for(int i=0;i<n;i++)
            {
                if(Data[i] == ' ')
                {
                    words++;
                }
            }
        }

        cout<<endl<<"lines are "<<lines;
        cout<<endl<<"Words are "<<words;
        cout<<endl<<"Characters are "<<characters;

        inobj.close();
    }
    return 0;
}