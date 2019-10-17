/*Create a user defined exception to check the following conditions and throw the exception if the criteria does not mmet
 * a. user has age between 18 an 55
 * b. user has income between 50k to 100k pm.
 * c. user stays in Pune/mumbai/banglore/chennai.
 * d. user has 4-wheeler.
 */

#include<iostream>
#include<cstring>

using namespace std;

class user
{
    public:
            int age, income;
            char city[20], vehicle;

            void accept();
            void display();
};

void user::accept()
{


    cout<<endl<<"Enter age";
    cin>>age;
    cout<<endl<<"Enter income";
    cin>>income;
    cout<<endl<<"Enter city";
    cin>>city;
    cout<<endl<<"Enter vehicle (y/n)";
    cin>>vehicle;

    cout<<strcmp(city, "pune");

    try
    {
        if(age > 18 ||  age >55)
        {
            throw 1;
        }
        else if(income < 50000 || income > 100000)
        {
            throw 2;
        }
        else if(strcmp(city, "pune") == 0 || strcmp(city, "mumbai") == 0 || strcmp(city, "banglore")  ==0 || strcmp(city, "chennai") == 0)
        {
            //
        }
        else if(vehicle == 'n')
        {
            throw 4;
        }
        else
        {
            throw 3;
        }
        
    }
    catch(int i)
    {
        switch(i)
        {
            case 1: cout<<"User age has to be between 18 and 55";
                    break;
            case 2: cout<<"User income must be between 50k and 100k";
                    break;
            case 3: cout<<"user city must be pune or mumbai or banglore or chennai";
                    break;
            case 4:
                    cout<<"user must have a vehicle";
                    break;
            deault: cout<<"no exception";
        }
    }
    

}

void user::display()
{
    cout<<endl<<"City is "<<city;
    cout<<endl<<"Income is"<<income;
    cout<<endl<<"Age is "<<age;
    cout<<endl<<"Vehicle "<<vehicle;
}


int main()
{


    user a;
    a.accept();
    a.display();



    return 0;
}

