import java.awt.*;
import java.applet.*;
import javax.swing.*;

public class JavaSwingStudActivity extends JApplet
{

	public void init()
	{
		Container co = getContentPane();
		co.setLayout(new GridLayout(0,2));
		JLabel jl = new JLabel("User Name");
		JTextField ja= new JTextField(5);
		JLabel jl1 = new JLabel("Password");
		JTextField ja1 = new JTextField(5);
		JButton jb = new JButton("submit");
		JButton jb1 = new JButton("cancel");
		co.add(jl);
		co.add(ja);
		co.add(jl1);
		co.add(ja1);
		co.add(jb);
		co.add(jb1);
	}
}
/*<applet code="JavaSwingStudActivity.class" width=100 height=100></applet>*/
