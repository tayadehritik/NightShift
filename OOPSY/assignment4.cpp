/* Develop an OOP in c++ to create a database of student information system containing the following information. Name , roll no, class, division, date of birth , blood group , contact adddress, telephone no, driving license number etc. Construct the database with suitable member functions for initializing and desstroying the data via constructor , default constructor, copy constructor, destructor, static member functions , friend class, this pointer, inline code & dynamic mememory allocation operators new and delete */
#include<iostream>
#include<string.h>

using namespace std;

class person_additional_info
{

    char address[20], license[20], insurance[20];
    long int contact;
    public:
        person_additional_info()
        {
            strcpy(address, "Xyz");
            strcpy(license, "XY-0000000000000");
            strcpy(insurance, "00000000000");
            contact = 000000000;
        }            
        ~person_additional_info()
        {
            cout<<endl<<"Object deleted in constructor"<<endl;
        }

        friend class person;

};

class person 
{
    char name[20], dob[20], blood[20];
    float ht, wt;
    static int count;
    person_additional_info *pai;
    public:
            person()
            {
                strcpy(name, "XYZ");
                strcpy(dob, "dd/mm/yyyy");
                strcpy(blood, "b+");
                ht = 0;
                wt = 0;
                pai = new person_additional_info();
            }
            person(person *p)
            {
                strcpy(this->name, p->name);
                strcpy(this->blood,p->blood);
                strcpy(this->dob,p->dob);
                this->ht =  p->ht;
                this->wt = p->wt;
                pai = new person_additional_info;
                strcpy(pai->address,p->pai->address);
                pai->contact = p->pai->contact;

            }
            static void showcount()
            {
                cout<<count;
            }
            ~person()
            {
                delete pai;
                cout<<endl<<"persons destructor"<<endl;
            }
            void getdata();
            inline void display();
};

void person::getdata()
{
    cout<<endl<<"enter name";
    cin>>name;
    cout<<"enter dob ";
    cin>>dob;
    cout<<"enter blood group";
    cin>>blood;
    cout<<"enter height";
    cin>>ht;
    cout<<"enter weight";
    cin>>wt;
    cout<<"Enter addresss";
    cin>>pai->address;
    cout<<"Enter license no";
    cin>>pai->license;
    cout<<"Enter contact no";
    cin>>pai->contact;
    cout<<endl;
    count++;
}
void person::display()
{
    cout<<endl<<"\t"<<name;
    cout<<"\t"<<dob;
    cout<<"\t"<<blood;
    cout<<"\t"<<ht;
    cout<<"\t"<<wt;
    cout<<"\t"<<pai->address;
    cout<<"\t"<<pai->license;
    cout<<"\t"<<pai->contact;
    cout<<endl;
}
int person::count;
int main()
{
    person *p1, *p2;
    int ch;
    
    p1 = new person();
    p2 = new person(p2);
    
    cout<<"\tName";
    cout<<"\tDOb";
    cout<<"\tblood";
    cout<<"\tht";
    cout<<"\twt";
    cout<<"\tAddress";
    cout<<"\tLicense";
    cout<<"\tContact";
    p1->display();
    cout<<endl;
    p2->display();
    cout<<endl;
    cout<<"Enter how many records you want to enter";
    int n;
    cin>>n;
    person p3[n];
    char name[20];
    int x = 0;
    do
    {
       
        cout<<"\nWelcome to personal database system";
        cout<<"\n1.Enter the record";
        cout<<"\n2.Display the record";
        cout<<"\n3.Exit";
        cin>>ch;
        switch(ch)
        {
            case 1:
            {
                p3[x].getdata();
                person::showcount();
                x++;
                break;
            }
            case 2:
            {
                cout<<"\tName";
                cout<<"\tDOb";
                cout<<"\tblood";
                cout<<"\tht";
                cout<<"\twt";
                cout<<"\tAddress";
                cout<<"\tLicense";
                cout<<"\tContact";
                for(int i=0;i<n;i++)
                {
                    cout<<endl;
                    p3[i].display();
                }
                break;
            }
        }

    } while (ch!=3);
    delete p1;
    delete p2;
    return 0;
}