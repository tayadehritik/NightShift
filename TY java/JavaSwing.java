import java.awt.*;
import javax.swing.*;
import java.applet.*;

/*<applet code="JavaSwing.class" width=100 height=100></applet>*/
public class JavaSwing extends JApplet
{
	public void init()
	{
		Container co = getContentPane();
		co.setLayout(new FlowLayout());
		JComboBox jb = new JComboBox();
		jb.addItem("item1");
		jb.addItem("item2");
		co.add(jb);
	}
}

