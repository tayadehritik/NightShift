/* Imagine a book publishing company which does marketing book and audiocassette versions. create a class pupblishing that store a title (a string)
and price (type float) at publication from this class derive two classes : book , which adds a page count (type int) and tape, which 
adds a playing times in minutes (type float) . Write a program that instantiates the books and tape classes, allows user to enter data and displays
the data members, If an exception is caught, replace all data members values with zero values. */
#include<iostream>

using namespace std;

class publication
{
    public: string title;
              float price ;
              void get();
              void disp();
};
void publication::get()
{
    cout<<endl<<"Enter title";
    cin>>title;
    cout<<"Enter price";
    cin>>price;
}

void publication::disp()
{
    cout<<endl<<"Title "<<title;
    cout<<endl<<"Price "<<price; 
}


class Book:public publication
{
    public:
            int pagecount;
            void insert();
            void display();
};

void Book::insert()
{
    get();
    cout<<"Enter pagecount "<<endl;
    try
    {
        /* code */
        cin>>pagecount;
        if(pagecount<=0)
        {
            throw pagecount;
        }
    }
    catch(int a)
    {
        cout<<"page count cannot be zero or less";
    }
    
}

void Book::display()
{
    cout<<endl<<title;
    cout<<endl<<price;
    cout<<endl<<pagecount;
}

class Tape:public publication
{
    public:
            int playingtime;
            void insert();
            void display();
};

void Tape::insert()
{
    get();
    cout<<endl<<"Enter playing time";
    try
    {
        /* code */
        cin>>playingtime;
        if(playingtime <= 0)
        {
            throw playingtime;
        }
    }
    catch(int a)
    {
        cout<<"playing time cannot be zero or less";
    }
    
}
void Tape::display()
{
    cout<<endl<<title;
    cout<<endl<<price;
    cout<<endl<<playingtime;
}
int main()
{
    int ch;
    Book b;
    Tape t;
    while(true)
    {
        cout<<"Enter choice"<<endl;
        cout<<"1.Enter book";
        cout<<"2.Enter tape";
        cout<<"3.Exit";
        cout<<"4.display book";
        cout<<"5.display tape";
        cin>>ch;
        switch(ch)
        {
            case 1:
                    b.insert();
                    break;
            case 2:
                    t.insert();
                    break;
            case 3:
                    exit(0);
            case 4:
                    b.display();
                    break;
            case 5:
                    t.display();
                    break;
            default: cout<<"Wrong choice enter again";

        }
    }
    return 0;
}