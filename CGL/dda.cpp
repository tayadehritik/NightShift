#include<iostream>
#include<graphics.h>
using namespace std;

class pixel
{
	protected: 
		int x1,x2,y1,y2;
	public:
		
		void getdata()
		{
			cout<<endl<<"Enter x1 and y1";
			cin>>x1>>y1;
			cout<<endl<<"Enter x2 and y2";
			cin>>x2>>y2;
		}

};


class Line:public pixel
{
	private:
		int dx,dy,DX,DY,e,len,x,y,m;
	public:
		void calculate()
		{
			dx = x2-x1;
			dy = y2-y1;
			m = dy/dx;
			
		}
		void draw()
		{
			getdata();
			calculate();
			x = x1;
			y = y1;
			while(x != x2 && y != y2)	
			{
				putpixel(abs(x),abs(y),RED);
				if(m<1)
				{
					y = y+m;
					x = x+1;			
				}
				else
				{
					y = y+1;
					x = x+m;
				}
			}			
		}


};

int main()
{
	int gd=DETECT,gm;
	initgraph(&gd,&gm,NULL);
	Line l;
	l.draw();
	getch();
	return 0;
}
