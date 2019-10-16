/*Write a c++ program create a calculator for arithmatic operator(+,-,*,/). This program should jave two operands from user and perform operation on those two operands depending upon the operator entered by the user. Use a switch statement to select the operation. Finally, display the result. Some sample interaction with program might look like this:
 * Enter first number, operator, second number: 10/3
 * Answer = 3.3333
 * Do another (y/n) ? y
 * Enter the first number, operator, second number : 12 + 100
 * Answer = 112
 * Do another (y/n) ? n
 */

#include<iostream>
using namespace std;

class calculator
{
    public:
            int a;
            int b;
            char op;
            int ans;
            calculator()
            {
                a = 0;
                b = 0;
            }
            void getdata()
            {
                cout<<"Enter first number, operator, second number: ";
                cin>>a>>op>>b;
                calculate();
            }
            void calculate()
            {
                switch(op)
                {
                    case '+' : ans = a + b;
                                print();
                                break;
                    case '-' : ans = a-b;
                                print();
                                break;
                    case '*' : ans = a*b;
                                print();
                                break;
                    case '/' : ans = a/b;
                                print();
                                break;
                    default: "break";
                }
            }
            void print()
            {
                cout<<endl<<"Answer = "<<ans<<endl;
            }
};

int main()
{
    char ch;
    calculator cal;
    while(ch!='n')
    {
        
        cal.getdata();
        
        cout<<"Do you want to continue (y/n) ?"<<endl;
        cin>>ch;
        
    }

    return 0;
}