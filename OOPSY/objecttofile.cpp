#include<iostream>
#include<fstream>
#include<cstring>
using namespace std;

class Employee
{
    public:
            int phno;
            string name;
    public:
        Employee()
        {
            phno = 0;
            name = "";
        }
        void write(int phno1, string name1 )
        {
            phno = phno1;
            name = name1;
        }
        void display()
        {
            cout<<endl<<phno;
            cout<<endl<<name;
        }
};



int main()
{
    Employee emp;
    emp.write(123,"hritik");
    ofstream outobj("hritik.txt", ios::out);
    outobj.write((char *)&emp, sizeof(emp));
    emp.write(456,"hritik1");
    outobj.write((char *)&emp, sizeof(emp));
    outobj.close();

    ifstream inobj("hritik.txt",ios::in);
    for(int i=0;i<2;i++)
    {
        inobj.read((char *)&emp, sizeof(emp));
        emp.display();
    }
    inobj.close();
    return 0;
}