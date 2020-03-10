#include<iostream>
#include<graphics.h>

using namespace std;

class pixel
{
	protected: 
		int xc, yc, r;
	public:
		void getdata()
		{
			cout<<endl<<"Enter center points x and y";
			cin>>xc>>yc;
			cout<<endl<<"Enter radius of circle";
			cin>>r;
		}

};

class BresCircle: public pixel
{
	private:
		int  x, y,d;
	public:
		

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

		void drawCircle()
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
	int ch;
	BresCircle c;
	while(true)
	{
		cout<<"\n1.Draw Circle \n2.Exit"<<endl;
		cin>>ch;
		
		switch(ch)
		{
			case 1: c.getdata();
				c.drawCircle();
				break;

			case 2:
				exit(0);

			default:
				cout<<endl<<"Wrong choice";

		
		}	
	
	}

	getch();	
	return 0;
}

