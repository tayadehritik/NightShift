#include<iostream>
using namespace std;


class tooverload
{
    public: int a,b;

    public:
        int operator +(int els)
        {
            int ret = a + els;
            return ret;
        }
        friend ostream  &operator<<(ostream &ab, toooverload &aa)
        {
            
            return ab;
        }
        friend istream  &operator>>(istream &ab, toooverload &aa)
        {
            
            return ab;
        }

};

int main()
{

    tooverload abc;
    cin>>abc;
    cout<<abc;
    return 0;
}