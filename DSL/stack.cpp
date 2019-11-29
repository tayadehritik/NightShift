#include<iostream>
using namespace std;
class stack1
{
    private:
            int top = 0;
            int stack[20];
            int n;
    
    public:
            stack1()
            {
                cout<<endl<<"Enter size for stack";
                cin>>n;
            }
            void push()
            {
                if(top == n)
                {
                    cout<<endl<<"Stack is full";  
                }
                else
                {
                    cout<<endl<<"Enter element to push";
                    cin>>stack[top];
                    top++;
                }
            }
            void pop()
            {
                cout<<endl<<"Popped element is "<<stack[top];
                top--;
            }
            void display()
            {
                for(int i=0;i<n;i++)
                {
                    cout<<stack[i];
                }
            }
};

int main()
{
    int ch;
    stack1 s;
    while(true)
    {
        cout<<endl<<"Enter choice 1.push 2.pop 3.display";
        cin>>ch;
        switch(ch)
        {
            case 1: s.push();
                    break;
            case 2: s.pop();
                    break; 
            case 3: s.display();
                    break;
        }
    }
    return 0;
}