#include<iostream>
using namespace std;

class node
{
    public: 
        int data;
        node *next;
        node *prev;
};
class dll
{
    private: 
        node *head;
    public:
        dll()
        {
            head = NULL;
        }
        void create()
        {
            node *temp = new node;
            cout<<endl<<"Enter data for new node";
            cin>>temp->data;
            if(head == NULL)
            {
                head = temp;
                temp->prev = NULL;
            }
            else
            {
                node *trav = head;
                while(trav->next != NULL)
                {
                    trav = trav->next;
                }
                trav->next = temp;
                temp->prev = trav;
                
            }
            
        }
        void display()
        {
            if(head == NULL)
            {
                cout<<endl<<"list empty";
            }
            else
            {
                node *trav = head;
                while(trav != NULL)
                {
                    cout<<trav->data;
                    trav = trav->next;
                }
            }
        }
        void displayreverse();

};
void dll::displayreverse()
{
    if(head == NULL)
    {
        cout<<endl<<"List empty";

    }
    else
    {
        node *trav = head;
        while(trav->next != NULL)
        {
        
            trav = trav->next;
            
        }
        while(trav!= NULL)
        {
            cout<<trav->data;
            trav = trav->prev;
        }

        
    
    }

}
int main()
{
    dll d;
    d.create();
    d.display();
    d.create();
    d.create();
    d.display();
    d.displayreverse();

    return 0;
}