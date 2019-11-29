#include<iostream>
using namespace std;

class stack
{
    private:
           char arr[100], top;

    public:
            stack()
            {
                top = 0;
            } 
            void push(int ele)
            {
                if(top == 100)
                {
                    cout<<endl<<"Stack full";
                }
                else
                {
                    arr[top] = ele;
                    top++;
                }
            }
            char pop()
            {
                if(top==0)
                {
                    cout<<endl<<"Stack empty";
                    return 0;
                }
                
                char data = arr[top];
                top--;
                return data;
            }
            bool isempty()
            {
                if(top == 0)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
            char getcurr()
            {
                return arr[top];
            }

};

int priority(char s)
{
    if(s == '(' || s== ')')
    {
        return 0;
    }
    else if(s == '+' || s == '-')
    {
        return 1;
    }
    else if(s == '*' || s == '/'|| s == '%')
    {
        return 2;
    }
    else if(s == '^')
    {
        return 3;
    }
    return 4;
}

int main()
{
    stack s;
    cout<<"Enter string";
    string s1;
    cin>>s1;
    for(int i=0;s1[i] != '\0';i++)
    {
        if( s1[i] == '(' || s1[i]== '+' || s1[i]== '-' ||s1[i] == '*' || s1[i] == '/' || s1[i] == '%' || s1[i] == '^'  || s1[i]== ')')
        {
            if(s1[i] == '(')
            {
                s.push(s1[i]);
            }
            else
            {

                if(priority(s1[i]) <= priority(s.getcurr()))
                {
                    //pop until priority > priority
                    while(priority(s1[i]) <= priority(s.getcurr()) && s.isempty() == false)
                    {
                        char data = s.pop();
                        cout<<data;
                    }
                }
                else
                {
                    s.push(s1[i]);
                }
                
            }
        }
        else
        {
            
            cout<<s1[i];
        }
    }   
    return 0;
}