/*

Write C++ program to store set of negative and positive numbers using linked
list. Write functions to
a) Insert numbers
b) Delete nodes with negative numbers
c) Create two more linked lists using this list, one containing all positive
numbers and other containing negative numbers
d) For two lists that are sorted; Merge these two lists into third resultant list that
is sorted

*/

#include<iostream>
using namespace std;

class node
{
    public:
            int data;
            node *next;
};

class list
{
    public:
            node *head;

    public:
            list()
            {
                head = NULL;   
            }
            void accept();
            void display();
            void delwithneg();

};

void list::accept()
{
    node *temp = new node;
    cout<<endl<<"Enter data";
    cin>>temp->data;

    if(head == NULL)
    {
        head = temp;
    }
    else
    {
        node *trav = head;
        while(trav->next != NULL)
        {
            trav = trav->next;
        }
        trav->next = temp;
    }
    
}
void list::display()
{

    if(head == NULL)
    {
        cout<<endl<<"List is empty";
    }
    else
    {
        node *trav = head;
        while(trav!=NULL)
        {
            cout<<trav->data<<"\t";
            trav = trav->next;

        }
    }
    

}

void list::delwithneg()
{
    node *trav = head;
    while(trav != NULL)
    {
        
        
    }
}

int main()
{
    list l;
    int ch;
    while(true)
    {
        cout<<"Enter choice\n1.accept\n2.display\n3.delete neg";
        cin>>ch;
        switch(ch)
        {
            case 1: l.accept();
                    break;
            case 2: l.display();
                    break;
            case 3: l.delwithneg();
                    break;
            default: cout<<endl<<"Wront choice"<<endl;
        }
    }
    return 0;
}