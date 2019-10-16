#include<iostream>
using namespace std;

class complex
{
    public:
            int r;
            int i;
            complex()
            {
                r = 0;
                i = 0;
            }
            complex operator +(complex t);
            complex operator *(complex t);
            friend ostream &operator <<(ostream &output, complex &t)
            {
                output<<t.r<<"+"<<t.i<<"i"<<endl;
            }
            friend istream &operator >>(istream &input, complex &t)
            {
                cout<<"Enter real and imaginar part"<<endl;
                input>>t.r>>t.i;
            }
};
complex complex::operator +(complex t)
{
    complex ret;
    ret.r = r + t.r;
    ret.i = i + t.i;
}

complex complex::operator *(complex t)
{
    complex ret;
    ret.r = ((t.r*r) - (t.i*i)) + ((t.r*i)+(t.i*r));
    return ret;
}

int main()
{
    
    complex b;
    cin>>b;
    cout<<b;
    return 0;
}