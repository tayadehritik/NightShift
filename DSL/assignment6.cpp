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
	public:
		node *head;
			
	public:
		dll()
		{
			head = NULL;
		}
		void insert();
		void display();
		void merge(node*);
		void insertint(int);	
	
};

void dll::insert()
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
		temp->prev = trav;
	}
}

void dll::insertint(int data)
{
	node *temp = new node;
	temp->data = data;
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
		temp->prev = trav;
	}

}

void dll::display()
{
	node *trav = head;
	while(trav != NULL)
	{
		cout<<trav->data<<"\t";
		trav = trav->next;
	}
}

void dll::merge(node *head1)
{
	dll d2;
	
	node *trav1 = head;
	node *trav2 = head1;
		
	while(trav1->next != NULL||trav2->next != NULL)
	{

		if(trav1->data < trav2->data)
		{
			d2.insertint(trav1->data);
			trav1 = trav1->next;
		}
		else if(trav2->data < trav1->data)
		{

			d2.insertint(trav2->data);
			trav2 = trav2->next;
		}
		else if(trav2->data == trav1->data)
		{
			trav1 = trav1->next;
			trav2 = trav2->next;
		}
	}
		
	while(trav1!=NULL)
	{
	
		d2.insertint(trav1->data);
		trav1 = trav1->next;
	}

	while(trav2!=NULL)
	{
	
		d2.insertint(trav2->data);
		trav2 = trav2->next;
	}
	cout<<endl;
	d2.display();
	
}

int main()
{
	dll d,d1;
	d.insert();
	d.insert();
	d.insert();
	d.display();
	d1.insert();
	d1.insert();
	d1.insert();
	d1.display();
	
	d.merge(d1.head);

	
	
	return 0;
}
