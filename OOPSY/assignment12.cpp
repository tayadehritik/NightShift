// Assignment 12 deque in stl

#include<iostream>
#include<deque>
using namespace std;

int main()
{
    
    deque<int> d;

    d.push_front(1);
    d.push_back(2);
    cout<<d.at(1);
    d.pop_front();
    d.pop_back();
    

    return 0;
}