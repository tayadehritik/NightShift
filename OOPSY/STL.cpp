#include<iostream>
#include<stack>
#include<queue>
#include<deque>
using namespace std;
// performing operations on dequeue using stl
int main()
{
    deque<int> abc;
    deque<int>::iterator i;
    abc.push_front(1);
    abc.push_back(2);
    abc.push_front(0);
    for(i=abc.begin();i!= abc.end();i++)
    {
        cout<<*i<<endl;
    }
    
    return 0;
}