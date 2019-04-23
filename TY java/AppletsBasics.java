import java.awt.*;
import java.applet.*;
import java.lang.*;
import java.util.*;

public class AppletsBasics extends Applet
{
    public void paint(Graphics g)
    {
        g.drawString("Hello World",100, 100);
    }
}
/*<applet code=AppletsBasics.class width = 300 height=400></applet>*/