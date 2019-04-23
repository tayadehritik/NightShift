import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="FrameApplet.class" width=400 height=400></applet>*/

class MyFrame extends Frame
{
	MyFrame(String title)
	{
		super(title);
		MyWindowAdapter adapter = new MyWindowAdapter(this);
		addWindowListener(adapter);
	}
	public void paint(Graphics g)
	{
		g.drawString("this is a frame",10,10);
	}
}
class MyWindowAdapter extends WindowAdapter
{
	MyFrame frame;
	MyWindowAdapter(MyFrame frame)
	{
		this.frame = frame;

	}
	public void windowClosing(WindowEvent e)
	{
	
		frame.setVisible(false);
	}

}
public class FrameApplet extends Applet
{
	public void init()
	{
		MyFrame frame = new MyFrame("This is a frame");
		frame.setVisible(true);
		frame.setSize(100,100);
	}
	public void paint(Graphics g)
	{
		g.drawString("This is applet",10,10);
	}


}
