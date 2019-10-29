#include<iostream>
using namespace std;

class queue
{
	public:
		int rear;
		int front;
		int arr[20];
		int size;

		queue()
		{

			size = 5;
			rear = -1;
			front = -1;
		}
		void insert()
		{

			if(rear == size-1)
			{
				cout<<"queue full";
			}
			else
			{

				if(rear == -1 && front == -1)
				{
					rear++;
					front++;
				}
				else
				{
					rear++;
				}
				cout<<"Enter data";
				int data;
				cin>>data;
				arr[rear] = data;
				 
			}

		}
		void del()
		{
			if(rear == -1 )
			{
				cout<<"Queue empty";
			}
			else
			{
				rear--;
			}
		
		}
		void display()
		{
			for(int i=front;i<=rear;i++)
			{
				cout<<arr[i];
			}
		
		}

};


int main()
{
	queue q;
	q.insert();
	q.insert();
	q.display();
	q.del();
	q.display();
	q.del();
	q.display();
	q.del();
	return 0;
}
