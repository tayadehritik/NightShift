import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.io.*;
class adapt extends Frame 
{
        
    public static void main(String args[])
    {
        adapt ab = new adapt();
        
        
        
    }
    public adapt()
    {
        this.setVisible(true);
        this.addWindowListener(new wind(this));
    }
}

class wind extends WindowAdapter
{
    adapt a;
    wind(adapt a)
    {
        this.a = a;

    }
    public void windowClosing(WindowEvent we)
    {
        a.setVisible(false);
    }
}