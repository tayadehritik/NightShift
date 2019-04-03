import java.awt.*;
import java.applet.*;

public class PSTQ1 extends Applet
{

    public void init()
    {
        Button b = new Button("click me");
        add(b);
    }
    public void paint(Graphics g)
    {
        g.drawString("hello",10,10);
    }
    

}