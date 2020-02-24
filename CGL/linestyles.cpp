#include<iostream>
#include<graphics.h>

using namespace std;

class pixel
{
	public:
		int x1, x2, y1,y2,thickness;
		pixel()
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
		int dx,dy,x,y,m;

		void calculate()
		{
			dx = x2-x1;
			dy = y2-y1;
			m = dy/dx;
		}

		void draw()
		{
			calculate();
			x = x1;
			y = y1;
			while(x <= x2 && y <= y2)
			{
				putpixel(abs(x),abs(y), RED);
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
		void drawdotted()
		{
			calculate();
			x = x1;
			y = y1;
			int i = 1;
			while(x <= x2 && y <= y2)
			{
				if(i%2 == 0)
				{
					putpixel(abs(x),abs(y), RED);
				}

	
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
				i++;
			}
		}

		void drawthick()
		{
			calculate();
			getthickness();
			x = x1;
			y = y1;
			int i = 1;
			while(x <= x2 && y <= y2)
			{
				
				putpixel(abs(x),abs(y),RED); 
				for(int j=0;j<thickness;j++)
				{
					putpixel(abs(x+j),abs(y),RED);
					putpixel(abs(x-j),abs(y),RED);

				}
	
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
				i++;
			}
		}
	
		void drawdashed()
		{
			calculate();
			x = x1;
			y = y1;
			int i = 0;
			while(x <= x2 && y <= y2)
			{
				if(i%9 == 0)
				{
					putpixel(abs(x),abs(y), RED);
					putpixel(abs(x+1), abs(y+1), RED);
					putpixel(abs(x-1), abs(y-1), RED);
				}


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
				i++;
			}

		}




};



int main()
{

	int gd=DETECT,gm;
	initgraph(&gd,&gm,NULL);
		
	dda linedotted;
	linedotted.drawdotted();
	
	dda linethick;
	linethick.drawthick();

	dda linedashed;
	linedashed.drawdashed();

	

	getch();
	return 0;

}
