#include<iostream>
using namespace std;

class pp
{
	public:
		int mord[20];
		int front;
		int rear;
		pp()
		{
			front = -1;
			rear = -1;

		}
		void insert();
		void del();
		void display();
		void isEmpty();
		void isFull();		

};

void pp::insert()
{
	if(rear %(size-1) == front)
	{
		cout<<"queue is full";

	}
	else
	{

		cout<<"Enter data";
		int data;
		cin>>data;
		if(rear == -1 || front == -1)
		{
			rear++;
			front++;
		}
		else
		{
			
		}
	}

}

int main()
{
	return 0;
}
