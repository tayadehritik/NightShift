#include<iostream>
#include<graphics.h>

using namespace std;

class pixel
{
	public:
		int x1, x2, y1,y2,thickness;
		void getdata()
		{

			cout<<endl<<"Enter x1 and y1";
			cin>>x1>>y1;
			cout<<endl<<"Enter x2 and y2";
			cin>>x2>>y2;
		}

		void getthickness()
		{

			cout<<endl<<"Enter thickness";
			cin>>thickness;
		}

};

class dda:public pixel
{
	
	public:
		int dx,dy,x,y,slope,xinc,yinc,steps;

		void calculate()
		{
			dx = x2-x1;
			dy = y2-y1;
			slope = dy/dx;
		}

		void getstepsandinc()
		{
			if(dx>dy)
			{
				steps = abs(dx);
			}
			else
			{
				steps = abs(dy);
			}

			xinc = steps/(float) dx;
			yinc = steps/(float) dy;

			x = x1;
			y = y1;
		}

		void draw()
		{
			calculate();
			getstepsandinc();
			

			for(int i=0;i<=steps;i++)
			{
				putpixel(x, y, RED);
				x = x + xinc;
				y = y + yinc;
			}
			
		}
		void drawdotted()
		{
			calculate();
			getstepsandinc();
			for(int i=0;i<=steps;i++)
			{
				if(i%2 == 0)
				{
					putpixel(x,y,RED);
				}
				x = x + xinc;
				y = y + yinc;		
			}
		}

		void drawthick()
		{
			calculate();
			getstepsandinc();
			getthickness();

			if(slope > 1)
			{
				cout<<"Running for steep slope";

			}
			else
			{
				cout<<"Running for gentle slope";
			}

			for(int i=0;i<=steps;i++)
			{
				putpixel(x,y,RED);
				for(int j=0;j<thickness;j++)
				{
					putpixel((x+j),y,RED);
					putpixel((x-j),y,RED);
				}
				x = x + xinc;
				y = y + yinc;
			
			}
		
		}
	
		void drawdashed()
		{
			calculate();
			getstepsandinc();

			for(int i=0;i<=steps;i++)
			{
				if(i%9 == 0)
				{
					putpixel(x,y,RED);
					putpixel(x+1,y+1,RED);
					putpixel(x-1,y-1,RED);
				}
				x = x+xinc;
				y = y+yinc;
			}	
		}
		void drawdasheddotted()
		{
			calculate();
			getstepsandinc();
			for(int i=0;i<=steps;i++)
			{
				if(i%9==0)
				{
					putpixel(x,y,RED);
				}
				else if(i%2==0)
				{
					putpixel(x,y,RED);
				}
				x = x + xinc;
				y = y + yinc;
			}
		}
};



int main()
{

	int gd=DETECT,gm;
	initgraph(&gd,&gm,NULL);
	int ch;
	dda line;
	while(true)
	{
		cout<<"Enter choice \n1.Draw line \n2.Draw Dotted line \n3.Draw Thick line\n4.Draw Dashed line \n5.Draw dashed dotted line";
		cin>>ch;
		switch(ch)
		{
			case 1: 
				line.getdata();
				line.draw();
				break;

			case 2: 
				line.getdata();
				line.drawdotted();
				break;

			case 3: 
				line.getdata();
				line.drawthick();
				break;

			case 4:
				line.getdata();
				line.drawdashed();
				break;

			case 5:
				line.getdata();
				line.drawdasheddotted();
				break;

			default:
				cout<<"wrong choice";	
		}
	
	}

	
	getch();
	return 0;

}

