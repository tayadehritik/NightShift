import java.awt.*;
import java.awt.event.*;
class Reclamation extends Frame implements ActionListener
{

	static Button b;
	static Label l;
	static Checkbox c1,c2;
	String msg="msg";
	public Reclamation(String title)
	{
		super(title);
		this.setLayout(new FlowLayout());
		MyWindowAdapter ma = new MyWindowAdapter(this);
		this.addWindowListener(ma);
		
	}
	public static void main(String args[])
	{
		Reclamation fr = new Reclamation("Hello Bitch");
		fr.setVisible(true);
		b = new Button("Click Me!");
		l = new Label("Label");
		CheckboxGroup cbg = new CheckboxGroup();
		c1 = new Checkbox("First",cbg,true);
		c2 = new Checkbox("Second",cbg,false);
		fr.add(b);
		fr.add(l);
		fr.add(c1);
		fr.add(c2);
		
	
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,100,100);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == b)
		{	
			msg = "Clicked";
			repaint();
		}
		
	}

}
class MyWindowAdapter extends WindowAdapter
{

	Reclamation rec;
	MyWindowAdapter(Reclamation rec)
	{
		this.rec = rec;
	}
	public void windowClosing(WindowEvent we)
	{
		rec.setVisible(false);
	}

}

