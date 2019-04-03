import java.awt.event.*;
import java.applet.*;
import java.awt.*;
/*<applet code="Keywala.class" width=100 height=100></applet>*/
public class Keywala extends Applet implements KeyListener 
{
    public void init()
    {
        this.addKeyListener(this);
    }
    public void keyPressed(KeyEvent ke)
    {
        System.out.println(ke.KEY_TYPED);
    }
    public void keyReleased(KeyEvent ke)
    {

    }
    public void keyTyped(KeyEvent ke)
    {

    }
}