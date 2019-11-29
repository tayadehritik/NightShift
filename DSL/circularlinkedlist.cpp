#include<iostream>
using namespace std;

class node
{
    public: 
        int data;
        node *next;
};

class cll
{
    private:
            node *head;
    public:
            cll()
            {
               head = NULL; 
            }
            void create()
            {
                node *temp = new node;
                cout<<"Enter data for new node";
                cin>>temp->data;
                if(head == NULL)
                {
                    head = temp;
                    temp->next = head;
                }
                else
                {
                    node *trav = head;
                    while(trav->next != head)
                    {
                        trav = trav->next;
                    }
                    trav->next = temp;
                    temp->next = head;
                }
            }
            void display();
};

void cll::display()
{

    if(head == NULL)
    {
        cout<<endl<<"List is empty";

    }
    else
    {
        node *trav = head;
        cout<<head->data;
        trav = trav->next;
        while(trav != head)
        {
            cout<<trav->data;
            trav = trav->next;
        }
    }
}

int main()
{
    cll c;
    c.create();
    c.display();
    c.create();
    c.create();
    c.display();
}
