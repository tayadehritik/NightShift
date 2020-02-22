#include<iostream>
#include<graphics.h>

using namespace std;

class BresCircle
{
	private:
		int xc, yc, x, y,d,r;
	public:
		BresCircle()
		{
			cout<<endl<<"Enter center x and y";
			cin>>xc>>yc;
			cout<<endl<<"Enter radius for circle";
			cin>>r;
	
		}

		void drawCircle(int nx, int ny)
		{
			putpixel(xc+nx, yc+ny,RED);
			putpixel(xc+nx, yc-ny,RED);
			putpixel(xc-nx, yc+ny,RED);
			putpixel(xc-nx, yc-ny,RED);
			putpixel(xc+ny, yc+nx,RED);
			putpixel(xc+ny, yc-nx,RED);
			putpixel(xc-ny, yc+nx,RED);
			putpixel(xc-ny, yc-nx,RED);
			

		}

		void bresCircle()
		{
			d = 3-(2*r);
			for(x=0,y=r;y>=x;x++)
			{
				drawCircle(x,y);
				cout<<d;
				if(d<0)
				{
					d = d + (4*x) + 6;
				}
				else
				{
					y = y-1;
					d = d + (4*(x-y)) + 10;
					
				}
					
			}

		}
};

int main()
{
	int gd=DETECT,gm;
	initgraph(&gd,&gm,NULL);
	BresCircle c;
	c.bresCircle();
	getch();	
	return 0;
}
