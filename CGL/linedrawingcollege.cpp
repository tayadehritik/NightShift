#include<iostream>
#include<stdio.h>
#include<math.h>
#include<graphics.h>
#define ROUND(a)((int)(a+0.5))
using namespace std;

class pixel
{
protected:int x1,x2,y1,y2;
public:
pixel()
{
x1=0;
x2=0;
y1=0;
y2=0;
}
void accept();

};
void pixel::accept()
{
cout<<"Enter the startign co-ordinates"<<endl;
cin>>x1;
cin>>y1;
cout<<"ENter the ending co-ordinates"<<endl;
cin>>x2;
cin>>y2;
}

class draw:public pixel
{
public:
void display(int a);
void display(double b);
};


void draw::display(int a)
{
int dx,dy,steps,k;
 dx=x2-x1;
 dy=y2-y1;
 float x=x1,y=y1,xinc,yinc;
 if(abs(dx)>abs(dy))
  steps=abs(dx);
 else
  steps=abs(dy);
 xinc=dx/(float)steps;
 yinc=dy/(float)steps;
 putpixel(ROUND(x),ROUND(y),3);
 for(k=0;k<steps;k++)
 {
  x+=xinc;
  y+=yinc;
  putpixel(ROUND(x),ROUND(y),3);
 }


getch();
closegraph();
}

void draw::display(double b)
{
int gd=DETECT,gm;
initgraph(&gd,&gm,NULL);
int dx,dy;
if(x2>x1)
{
dx=x2-x1;
}
else
{
dx=x1-x2;
}
if(y2>y1)
{
dy=y2-y1;
}
else
{
dy=y1-y2;
}
int x=x1;
int y=y1;
int G=(2*dy)-dx;
for(int i=0;i<=dx;i++)
{
putpixel(x,y,3);
while(G>=0)
{
y=y+1;
G=G-(2*dx);
}
x=x+1;
G=G+(2*dy);
}
getch();
closegraph();
}

int main()
{
draw d;
LABEL:d.accept();
int ch;
cout<<"1.DDA   2.BRESENHAM"<<endl;
cin>>ch;
int gd=DETECT,gm;
initgraph(&gd,&gm,NULL);
switch(ch)
{
case 1:
{
d.display(1);
}
break;
case 2:
{
d.display(2.5);
}
break;
}

char ch1;
do
{
restorecrtmode();
char ch1;
cout<<"Want to display another(y/n)"<<endl;
cin>>ch1;
if(ch1=='y' || ch1=='Y')
goto LABEL;
else
exit(0);
}while(ch1!='n');
return 0;
}
