/* Write a menu driven program that will creeate a data file containing the list of telephone numbers in the following form.
 * 	John 	23456
 * 	Ahmed	9876
 * Use  a class object to store each set of data, access the file created and implement the following tasks
 * 1. Determine the telephone number of specified person
 * 2. Determine the name if telephone number is known.
 * 3. Update telephone number , whenever there is change.
 */

#include<iostream>
#include<cstring>
#include<fstream>

using namespace std;
class telephone
{
    public:
        long int telephonen;
        string name;

        void accept();
        void display();
        bool DetTel(string nametc);
        bool DetName(long int teltc);
        


};


void telephone::accept()
{
    cout<<endl<<"Enter name";
    cin>>name;
    cout<<endl<<"Enter telephne no";
    cin>>telephonen;
}

void telephone::display()
{
    cout<<endl<<"\t"<<name;
    cout<<"\t"<<telephonen;
}

bool telephone::DetName(long int teltc)
{
    int flag = 0;
    if(telephonen == teltc)
    {
        return true;
    }
    else
    {
        return false;
    }
    
}

bool telephone::DetTel(string nametc)
{
    if(name == nametc)
    {
        return true;
    }
    else
    {
        return false;
    }
    
}


int main()
{


    fstream file;
    
    int ch;
    int n;
    cout<<"Enter number of records to enter";
    cin>>n;

    while(true)
    {
        telephone phone;
        int flag = 0;
        string name;
        long int teltc;
        cout<<endl<<"Enter choice";
        cout<<endl<<"1.Search telephone using name";
        cout<<endl<<"2.Search name using telephone";
        cout<<endl<<"3.Update telphone no";
        cout<<endl<<"4.Enter records";
        cout<<endl<<"5.display records";
        cout<<endl<<"6.exit";
        cin>>ch;
        switch(ch)
        {

            case 1: file.open("abc.txt", ios::in);
                    
                    cout<<endl<<"Enter name to determine telephone by";
                    
                    cin>>name;
                    for(int i=0;i<n;i++)
                    {
                        file.read((char *) &phone, sizeof(phone));
                        if(phone.DetTel(name))
                        {
                            flag = 1;
                            break;
                        }
                    }
                    if(flag == 1)
                    {
                        cout<<"Telephone found"<<endl;
                        phone.display();
                    }
                    else
                    {
                        cout<<"Telephone not found";
                    }
                    

                    file.close();
                    break;


            case 2: file.open("abc.txt", ios::in);
                    cout<<"Enter telephone to search name by";
                    cin>>teltc;
                    for(int i=0;i<n;i++)
                    {
                        file.read((char *) &phone, sizeof(phone));
                        if(phone.DetName(teltc))
                        {
                            flag = 1;
                            break;
                        }

                    }

                    if(flag == 1)
                    {
                        cout<<"Name found"<<endl;
                        phone.display();
                    }
                    else
                    {
                        cout<<"name not found";
                    }
                    

                    file.close();
                    break;

            case 4: 
                    file.open("abc.txt", ios::out);
                    for(int i=0; i<n;i++)
                    {
                        phone.accept();
                        file.write((char *) &phone, sizeof(phone));
                    }
                    file.close();
                    break;

            case 5: file.open("abc.txt", ios::in);
                    for(int i=0;i<n;i++)
                    {
                        file.read((char *) &phone, sizeof(phone));
                        phone.display();
                    }
                    file.close();
                    break;
            case 6: exit(0);
                    
            default: cout<<"wrong choice";
        }
    }


    return 0;
}