import java.awt.*;
import java.applet.*;
import java.lang.*;
import java.util.*;

public class GraphicsClasses extends Applet
{
    public void paint(Graphics g)
    {

        g.setColor(Color.red);
        g.drawLine(100, 100, 200, 200);
        g.drawRect(300,300, 100, 50);
        g.fillRect(300,300,100,50);
        g.drawRoundRect(300,350, 100, 50, 15,15);
        g.drawOval(400,400,100,100);
        g.fillOval(400,450,100,100);
        int arg0[] = {10,20};
        int arg1[] = {30, 40};
        int arg2 = 2;
        g.drawPolygon(arg0, arg1, arg2);
        
    }
}
/*<applet code=GraphicsClasses.class height=800 width=800></applet>*/