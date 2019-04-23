import java.awt.*;
import java.awt.event.*;

class FrameExample extends Frame
{

    
   
    public static void main(String args[])
    {
        FrameExample fr = new FrameExample();
        fr.setTitle("Hello Bitch");
        fr.setVisible(true);
        fr.setSize(400,400);
        fr.addWindowListener(new WindowClosingAdapter(fr));
    }

}
class WindowClosingAdapter extends WindowAdapter
{
    FrameExample fr;
    WindowClosingAdapter(FrameExample fr)
    {
        this.fr = fr;
    }
    public void windowClosing(WindowEvent e)
    {
        fr.setVisible(false);
    }
}