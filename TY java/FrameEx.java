import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;
class FrameExN extends Frame 
{
	FrameExN(String title)
	{
		super(title);
		MyWindowAdapter adapter = new MyWindowAdapter(this);
		this.addWindowListener(adapter);
		
	}
}
class FrameEx 
{
	
	public static void main(String args[])
	{
		FrameExN f = new FrameExN("Hi there");
		f.setVisible(true);	
	
	}
}
class MyWindowAdapter extends WindowAdapter
{
	FrameExN frame;
	MyWindowAdapter(FrameExN frame)
	{
		this.frame = frame;
	}
	public void windowClosing(WindowEvent e)
	{
		frame.setVisible(false);
	}
}


