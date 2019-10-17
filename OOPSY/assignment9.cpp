/* Write a c++ program that creates an output file writes information to it, closes the file and open it again as an input file and read the information from the file.*/

#include<iostream>
#include<cstring>
#include<fstream>
using namespace std;

class filef
{
    public:
            int roll;
            string name;
            void accept()
            {
                cout<<endl<<"Enter name and roll";
                cin>>name>>roll;
            }
            void display()
            {
                cout<<endl<<"Name:"<<name<<endl<<"Roll:"<<roll;
            }

};


int main()
{
    filef fileob[3];
    fstream file;

    file.open("abc1.txt",ios::out);
    for(int i=0;i<3;i++)
    {
        fileob[i].accept();
        file.write((char *) &fileob[i], sizeof(fileob[i]));

    }
    file.close();


    file.open("abc1.txt", ios::in);
    for(int i=0;i<3;i++)
    {
        file.read((char *) &fileob[i], sizeof(fileob[i]));
        fileob[i].display();
    }


    return 0;
}


