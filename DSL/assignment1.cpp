/*
Write C/C++ program to store marks scored for first test of subject
'Data Structures and Algorithms' for N students. Compute
I. The average score of class
ii. Highest score and lowest score of class
iii. Marks scored by most of the students
iv. list of students who were absent for the test
*/

#include<iostream>
using namespace std;
class dsaexam
{
    private:
            int n;
            int max;
            int hcore;
            int lscore;
            int mmarks[20];
            int roll[20];
            
    public:
            
            void accept();
            void resultanalysis();
            void display();
            void average();
            void highestscore();
            void lowestscore();
            void mostmarks();
            void absentstudents();
};


void dsaexam::accept()
{
    cout<<"Enter n and max\n";
    cin>>n>>max;
    for(int i=0;i<n;i++)
    {
        cout<<endl<<"Enter roll no"<<endl;
        cin>>roll[i];
        cout<<endl<<"Enter marks"<<endl;
        cin>>mmarks[i];
    }
}

void dsaexam::resultanalysis()
{
    
}

void dsaexam::display()
{
    cout<<"***DSA Exam***";
    average();
    highestscore();
    lowestscore();
    mostmarks();
    absentstudents();

}

void dsaexam::average()
{
    int sum = 0;
    for(int i=0;i<n;i++)
    {
        sum = sum + mmarks[i];
    }
    cout<<endl<<"Average is: "<<sum/n;
}
void dsaexam::highestscore()
{
    int highest = mmarks[0];
    for(int i=1;i<n;i++)
    {
        if(mmarks[i]>highest)
        {
            highest = mmarks[i];
        }
    }
    cout<<endl<<"Highest score is: "<<highest;
}
void dsaexam::lowestscore()
{
    int lowest = mmarks[0];
    for(int i=1;i<n;i++)
    {
        if(mmarks[i]<lowest && mmarks[i] != -1)
        {
            lowest = mmarks[i];
        }
    }
    cout<<endl<<"Lowest score is: "<<lowest;
}
void dsaexam::mostmarks()
{

    int mostmarks = 0;
    int mcount = 0;
    for(int i=0;i<n;i++)
    {
        int count = 1;
        for(int j=0;j<n;j++)
        {
            if(mmarks[j] == mmarks[i] && i != j)
            {
                count = count + 1;
                
            }
        }

        if(count>mcount)
        {
            mcount = count;
            mostmarks = mmarks[i];
        }
    }
    cout<<endl<<"Most marks are: "<<mostmarks<<" With count of: "<<mcount;
}
void dsaexam::absentstudents()
{
    int absentcount = 0;
    for(int i=0;i<n;i++)
    {
        if(mmarks[i]<0)
        {
            absentcount++;
        }
    }
    cout<<endl<<"No of absent students are: "<<absentcount;
}


int main()
{
    dsaexam dse;
   
    dse.accept();
    dse.resultanalysis();
    dse.display();
    
    return 0;
}