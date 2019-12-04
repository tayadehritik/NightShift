#include<iostream>
using namespace std;

template<class T>
class abc
{
    private: 
            T a, b;

    public:
            void write(T arg1, T arg2)
            {
                a = arg1;
                b = arg2;
            }
            void display()
            {
                cout<<a<<b;

            }
};

int main()
{
    abc<int> ab;
    ab.write(1,2);
    ab.display();
    abc<float> ba;
    ba.write(1.1,2.2);
    ba.display();

    return 0;
}