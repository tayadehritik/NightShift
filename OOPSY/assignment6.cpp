/* A book shop maintains the inventory of books that are sold at the book shop . The list includes details such as author, title , price, publisher and stock positions. Whenever a customer wants a book, the sales person inputs the titlee and author and the system searches the list and displays whether it is available or not. If it is not, an appropriate message is displayed. If it is, then the system isplays the book details and requests for the number of copies required. If the requeseted copies are available, the toatl cost of the requested copies is displayed ; otherwise the emssage. Required copies not in stock displayed design a system usign a class books with suitable member functions and constructors, use new operator in constructors to allocate memory space required. Implement c++ program for the system. */
#include<iostream>
#include<cstring>
using namespace std;

class book
{
    public:
        char title[20];
        char author[20];
        char publication[20];
        int stock;
        float price;
        book *next;
    public:
        void display(book *);
        book* getdata(book *);
        book* search(book *);
        book* getnode();
        book* del(book*, book*);
};

book* book::getnode()
{
    book *temp = new book;
    cout<<"\nEnter book title";
    cin>>temp->title;
    cout<<"\nEnter author name";
    cin>>temp->author;
    cout<<"\nEnter book publication";
    cin>>temp->publication;
    cout<<"\nenter book stock"; 
    cin>>temp->stock;
    cout<<"\nEnter book price";
    cin>>temp->price;
    temp->next = NULL;
    return temp;
}


book* book::getdata(book *head)
{
    book *trav = head;
    if(head == NULL)
    {
        head = getnode();
    }
    else
    {
        while(trav->next != NULL)
        {
            trav = trav->next;
        }
        trav->next = getnode();
    }

    return head;
    
}

void book::display(book *head)
{
    book *trav = head;
    if(head == NULL)
    {
        cout<<"list is empty";
    }
    else
    {
        
        cout<<endl;
        cout<<"\t Title";
        cout<<"\t author";
        cout<<"\t price";
        cout<<"\t stock";
        while(trav != NULL)
        {
            cout<<endl;
            cout<<"\t"<<trav->title;
            cout<<"\t"<<trav->author;
            cout<<"\t"<<trav->price;
            cout<<"\t"<<trav->stock;
            trav = trav->next;
        }
    }
    
}


book* book::del(book *temp, book *head)
{
    book *delnode, *trav = head;
    if(trav == temp)
    {
        delnode = head;
        head = head->next;
        delete delnode;

        
    }
    else
    {
        while(trav->next != temp)
        {
         trav = trav->next;

        }
        delnode = trav->next;
        trav->next = delnode->next;
        delete delnode;

    }
    return head;
}

book* book::search(book *head)
{
    int flag = 0;
    book *trav = head;
    char ath[20]; char tit[20]; int pur = 0;
    cout<<"Enter title and author to search";
    cin>>tit>>author;
    while(trav!=NULL)
    {

        if(strcmp(trav->title,tit)== 0 && strcmp(trav->author,ath)==0)
        {
            cout<<"\n***********Found**********\n";
            cout<<"\t"<<trav->title;
            cout<<"\t"<<trav->author;
            cout<<"\t"<<trav->publication;
            cout<<"\t"<<trav->price;
            cout<<"\nEnter number of copies to purchase";
            cin>>pur;
            if(trav->stock>=pur)
            {
                trav->stock = trav->stock - pur;
                cout<<"total bill is"<<trav->price * pur;
                if(trav->stock = 0)
                {
                    head = del(trav, head);
                }
                
                
            }
            else
            {
                cout<<"out of stock";
            }
            flag = 1;
            break;

        }
        trav = trav->next;

    }
    if(flag == 0)
    {
        cout<<"sorry record not found";
    }

    return head;
}


int main()
{
    int ch;
    
    book *head = NULL;
    while(true)
    {
        cout<<"\n1.Enter book information";
        cout<<"\n2.display book information";
        cout<<"\n3.purchase the book";
        cout<<"\n4.Exit";
        cout<<"\nEnter you choice";
        cin>>ch;
        
        switch(ch)
        {
            case 1:
                    head = head->getdata(head);
                    break;
            case 2:
                    head->display(head);
                    break;
            case 3: 
                    head = head->search(head);
                    break;
            case 4: 
                    exit(0);
            default:
                    cout<<"wrong choice";
                    
        }
    }
    return 0;
    
}