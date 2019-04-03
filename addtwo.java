import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="addtwo.class" width=100 height=1000></applet>*/
public class addtwo extends Applet implements ActionListener
{
    TextField tf1;
    TextField tf2;
    public void init()
    {
        Button b = new Button("Add");
        tf1 = new TextField(10);
        tf2 = new TextField(10);
        add(tf1);
        add(tf2);
        add(b);
        b.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ae)
    {
        System.out.println("clicked");
        int num1 = Integer.parseInt(tf1.getText());
        int num2 = Integer.parseInt(tf2.getText());
        int sum = num1+num2;
        tf2.setText(Integer.toString(sum));
        this.repaint();


    }
}