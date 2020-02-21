#include<iostream>
#include<graphics.h>
using namespace std;

class pixel
{
	protected: 
		int x1,x2,y1,y2;
	public:
		pixel()
		{
			x1=x2=y1=y2=0;
		}
		void getdata()
		{
			cout<<endl<<"Enter x1 and y1";
			cin>>x1>>y1;
			cout<<endl<<"Enter x2 and y2";
			cin>>x2>>y2;
		}

};


class line:public pixel
{
	private:
		int dx,dy,DX,DY,e,len,x,y;
	public:
		void calculate()
		{
			dx = x2-x1;
			dy = y2-y1;
			
		}
		void draw()
		{
			getdata();
			calculate();

			int m = dx/dy;
			if(m<1)
			{
					
			}
			else
			{
			
			}			
		}


};

int main()
{
	int gd=DETECT,gm;
	initgraph(&gd,&gm,NULL);
	putpixel(50,50,RED);
	
	getch();
	return 0;
}
