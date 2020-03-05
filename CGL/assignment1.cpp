#include<iostream>
#include<graphics.h>
using namespace std;

class pixel
{
	protected:
		int x1,y1,x2,y2;
	public:
		void getdata()
		{
			cout<<endl<<"Enter x1 and y1";
			cin>>x1>>y1;
			cout<<endl<<"Enter x2 and y2";
			cin>>x2>>y2;
		}

};

class Line: public pixel
{
	private:
		int dx, dy, xinc, yinc, steps, x, y;
		int slope_error;
	public:
		void calculate()
		{
			dx = x2-x1;
			dy = y2-y1;
			slope_error = (2*dy) - (dx);	
		}
		void drawDDA()
		{
			getdata();
			calculate();
			if(dx>dy)
			{
				steps = abs(dx);
			}
			else
			{
				steps = abs(dy);
			}

			xinc = dx/(float) steps;
			yinc = dy/(float) steps;
			
			x = x1;
			y = y1;

			for(int i=0;i<=steps;i++)
			{
				putpixel(x,y,RED);
				x = x + xinc;
				y = y + yinc;
			}

		}

		void drawBresenham()
		{
			getdata();
			calculate();
			
			for(x = x1,y = y1;x<=x2 && y<=y2;)
			{
				putpixel(x,y,RED);
				if(slope_error >= 0)
				{
					y = y + 1;
					slope_error += (2*dy) - (2*dx);
				}
				else
				{
					slope_error += (2*dy);
					x++;
				}
			
			}
			
		}
	
};

int main()
{

	int gd=DETECT,gm;
	initgraph(&gd,&gm,NULL);
	Line l;
	l.drawDDA();
	l.drawBresenham();		

	getch();
	return 0;
}
