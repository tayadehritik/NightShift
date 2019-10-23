/* Addition of two binary numbers using stack in stl */
#include<iostream>
#include<stack>

using namespace std;

stack<int> read()
{
    char a[20];
    cout<<endl<<"Enter binary number";
    cin>>a;
    stack<int> s;
    for(int i=0;a[i] != '\0';i++)
    {
        if(a[i] == '1')
        {
            s.push(1);
        }
        else if(a[i] == '0')
        {
            s.push(0);
        }
    }
    return s;
}

void display(stack<int> s)
{
    cout<<"\n Sum = ";
    while(!s.empty())
    {
        cout<<s.top();
        s.pop();
    }
}

stack<int> add(stack<int> a, stack<int> b)
{
    stack<int> c;

    int sum, carry = 0,bit1,bit2;
    while(!a.empty() || !b.empty())
    {
        bit1 = bit2 = 0;
        if(!a.empty())
        {
            bit1 = a.top();
            a.pop();
        }
        if(!b.empty())
        {
            bit2 = b.top();
            b.pop();
        }

        sum = (bit1+bit2+carry)%2;
        carry = (bit1+bit2+carry)/2;
        c.push(sum);
    }

    if(carry == 1)
    {
        c.push(1);
    }

    return c;
}


int main()
{
    stack<int> b1 = read();
    stack<int> b2 = read();
    stack<int> b3 = add(b1,b2);
    display(b3);
    return 0;
}


