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
		int dx,dy,x,y,Dx,Dx,e;
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
		}

};

int main()
{
	int gd=DETECT,gm;
	initgraph(&gd,&gm,NULL);
	Line l;
	getch();
	return 0;
}

