/* write c++ program using stl sorting and searching with user defined records such as personal record , item record*/

#include<iostream>
#include<list>

#include<algorithm>

using namespace std;

int main()
{
    list<int> a;
    list<int>::iterator i;
    a.push_front(1);
    a.push_back(1);
    a.sort();

    for(i = a.begin();i!=a.end();i++)
    {
        //
    }
    return 0;
}