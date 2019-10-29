#include<iostream>
using namespace std;
class stack
{
	private:
		char arr[20];
			
		char expr[40];
		int top;
		int size;
		
	public:
		stack()
		{
			top = -1;
			size = 20;
		}
		void push(char data)
		{
			if(top != size-1)
			{
				top++;
				arr[top] = data;
			} 
			else
			{
				cout<<endl<<"Stackoverflow";
			}
		}
		char pop()
		{
			if(top != -1)
			{
				char re = arr[top];
				top--;
				return re;
			}
			else
			{
				cout<<endl<<"Stackunderflow";
				return -1;
			}
		}
		void display()
		{

			for(int i=0;i<=top;i++)
			{
				cout<<arr[i];
			
			}
		}
		void wellparen()
		{

			cout<<"Enter expre";
			cin>>expr;
			int flag = 1;
			for(int i=0;expr[i] != '\0';i++)
			{

				if(expr[i] == '(' || expr[i] == '[' || expr[i] == '{')
				{
					push(expr[i]);
	
				}
				else if( expr[i] == ')' || expr[i] == ']' || expr[i] == '}')
				{
					
					char op = pop();
					if(expr[i] == ')' && op != '(')
					{
						flag = 0;
						break;
					}
					else if(expr[i] == ']' && op != '[')
					{
						flag = 0;
						break;
					}
					else if(expr[i] == '}' && op != '{')
					{
						flag = 0;
						break;
					}
					
				}
			}

			if(flag == 1 && top == -1)
			{
				cout<<"Well";
			}
			else
			{
				cout<<"not well";
			}
			display();
		}
		
	
};
int main()
{
	
	stack s;
	s.wellparen();
	
	return 0;
}
