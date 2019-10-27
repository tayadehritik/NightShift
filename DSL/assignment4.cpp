/*
Department of Computer Engineering has student's club named 'Pinnacle Club'.
Students of Second, third and final year of department can be granted
membership on request. Similarly one may cancel the membership of club. First
node is reserved for president of club and last node is reserved for secretary of
club. Write C++ program to maintain club member„s information using singly
linked list. Store student PRN and Name. Write functions to :
a) Add and delete the members as well as president or even secretary.
b) Compute total number of members of club
c) Display members
d) Display list in reverse order using recursion
e) Two linked lists exists for two divisions. Concatenate two lists.

*/

#include<iostream>
using namespace std;
class node
{
    public:
            int data;
            string name;
            node *next;
            
};


class pinclub
{

    public:
            node *pres;
            node *sec;
    public:
            pinclub()
            {
                pres = NULL;
                sec = NULL;
            }
            void accept();
            void display();
            void addpres();
            void addsec();
            void reverse(node*);
            void concat(pinclub);

};

void pinclub::accept()
{
    node *temp = new node;
    cout<<endl<<"Enter student PNR no and name";
    cin>>temp->data>>temp->name;
    if(pres == NULL)
    {
        pres = temp;
        pres->next = sec;
        sec = temp;
        sec->next = NULL;
    }
    else
    {
    
        node *trav = pres;
        while(trav != sec )
        {
            trav = trav->next;
        }
        trav->next = temp;
        sec = temp;
        

    }
}

void pinclub::display()
{
    cout<<"In display";
    if(pres == NULL )
    {
        cout<<endl<<"List is empty";
    }
    else
    {
        node *trav = pres;
        while(trav!=NULL)
        {
            cout<<endl<<trav->data<<"\t"<<trav->name;
            trav = trav->next;
        }
    }
    
}

void pinclub::addpres()
{

    node *temp = new node;
    cout<<endl<<"Enter president PNR no. and name ";
    cin>>temp->data>>temp->name;
    if(pres == NULL)
    {
        pres = temp;
        pres->next = sec;
        
    }
    else
    {
        node *temp1 = pres;
        pres = temp;
        pres->next = temp1->next;
    }
    
    

}
void pinclub::addsec()
{
    node *temp = new node;
    cout<<endl<<"Enter secretary PNR no. and name ";
    cin>>temp->data>>temp->name;
    if(sec==NULL)
    {
        sec = temp;
        sec->next = temp; 

    }
    else
    {
        node *trav = pres;
        while(trav!=sec)
        {
            trav = trav->next;
        }
        trav->next = temp;
        sec = temp;

    }
    
}
void pinclub::reverse(node *ab)
{
    if(ab==sec)
    {
        cout<<endl<<ab->data<<"\t"<<ab->name;
    }
    else
    {
        
        reverse(ab->next);
        cout<<endl<<ab->data<<"\t"<<ab->name;
    }
    
}

void pinclub::concat(pinclub pin)
{
    node *trav = pres;
    while(trav!=sec)
    {
        trav = trav->next;
    }
    trav->next = pin.pres;

}
int main()
{
    pinclub p;
    pinclub p2;
    int ch;
    while(true)
    {
        cout<<endl<<"Enter choice \n1.Accept\n2.display\n3.Add press\n4.Add sec\n5.Reverse\n6.Concat";
        cin>>ch;
        switch(ch)
        {
            case 1: p.accept();
                    break;
            case 2: p.display();
                    break;
            case 3: p.addpres();
                    break;
            case 4: p.addsec();
                    break;
            case 5: p.reverse(p.pres);
                    break;
            case 6: 
                    p2.accept();
                    p2.accept();
                    p2.accept();
                    p.concat(p2);
                    p.display();
                    break;

            default: cout<<endl<<"Wrong choice";
        }
    }
    return 0;
}