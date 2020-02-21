#include<iostream>
#include<graphics.h>
using namespace std;

class pixel
{
	protected:
		int x1,x2,y1,y2;
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
		int dx,dy,x,y,e;
	public:
		Line()
		{
			getdata();
			dx = x2-x1;
			dy = y2-y1;
			e = (2*dy)-dx;
		}
		void draw()
		{
			for(int x = x1,y = y1;x<=x2;x++)
			{
				putpixel(x,y,RED);
				if(e < 0)
				{
					e = e + (2*dy);
				}
				else if(e >= 0)
				{
					e = e + (2*dy) - (2*dx);
					y = y + 1;
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

