/*

Write C++ program for string operations- copy, concatenate, check substring, equal,
reverse and length

*/

#include<iostream>
using namespace std;


class strings
{
    private:
        char str1[20];
        char str2[20];

    public:
        void accept();
        void display();
        void copy();
        void concatenate();
        void substr(char *);
        bool equal(char *, char *);
        void reverse();
        int length(char *);
       

};

void strings::accept()
{
    cout<<"Enter string 1 and 2 "<<endl;
    cin>>str1>>str2;
}

void strings::display()
{
    cout<<"String1: "<<str1<<endl;
    cout<<"String2: "<<str2<<endl;
}

void strings:: copy()
{
    for(int i=0;str2[i]!='\0';i++)
    {
        str1[i] = str2[i];
    }
    cout<<endl<<"Copied String 2 into String 1"<<endl;
    display();
}

void strings::concatenate()
{
    int k=0;
    char arr[20];
    for(int i=0;str1[i]!='\0';i++,k++)
    {
        arr[k] = str1[i];
    }
    
    for(int j=0;str2[j]!='\0';j++,k++)
    {
        arr[k] = str2[j];
    }
    
    arr[k] = '\0';

    cout<<endl<<"Concatenated string is: ";
    for(int j=0;arr[j]!='\0';j++)
    {
        cout<<arr[j];
    }
    cout<<endl;
    
}


bool strings::equal(char *abc, char *bcd)
{
    int l1 = length(abc);
    int l2 = length(bcd);
    if(l1 == l2)
    {
        for(int i=0;i<l1;i++)
        {
            if(abc[i] != bcd[i])
            {
                return false;
            }
        }
        return true;
    }
    else
    {
        return false;
    }
    
}

void strings::reverse()
{
    int l = length(str1);
    int b = length(str2);
    cout<<endl;
    for(int i=l;i>=0;i--)
    {
        cout<<str1[i];
    }
    cout<<endl;
    for(int i=b;i>=0;i--)
    {
        cout<<str2[i];
    }
}

void strings::substr(char *abc)
{
    int l1 = length(abc);
    int l2 = length(str1);
    int l3 = length(str2);
    int flag;
    cout<<endl; 
    cout<<str1;
    cout<<endl<<str2<<endl;
    
    for(int i=0;i<l2;i++)
    {
        
        if(str1[i] == abc[0])
        {
            flag = 1;

            for(int j=1,k=i+1;j<l1;j++,k++)
            {
                
                if(str1[k] != abc[j])
                {
                    flag = 0;
                    break;
                }
            }
            if(flag == 1)
        {
            cout<<"Substring found"<<endl;
        }

        }

        
    }
 

}


int strings::length(char *abc)
{
    int l=0;
    for(int i=0;abc[i] != '\0';i++)
    {
           
        l++;
    }
    
    return l;
}

int main()
{
    strings s;
    s.accept();
    s.display();
    s.copy();
    s.concatenate();
    s.reverse();
    char abc[20] = "ya";
    s.substr(abc);
    return 0;
}