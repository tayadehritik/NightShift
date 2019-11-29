#include<iostream>
using namespace std;

class node
{
    public:
        int data;
        node *next;    
};

class sll
{
    private:
        node *head;

    public:
        sll()
        {
            head = NULL;
        }
        void create()
        {
            node *temp = new node();
            cout<<endl<<"Enter data for element";
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
        void insert()
        {
            create();
        }
        
        void display();

};

void sll::display()
{
    if(head == NULL)
    {
        cout<<endl<<"list empty";
    }
    else
    {
        node *temp = head;
        while(temp != NULL)
        {
            cout<<temp->data;
            temp = temp->next;
        }
    }
}

int main()
{
    cout<<"hello world";
    sll s1;
    s1.create();
    s1.display();
    s1.create();
    s1.create();
    s1.display();
    return 0;
}