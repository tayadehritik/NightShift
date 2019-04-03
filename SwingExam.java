import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.util.*;
import javax.swing.tree.*;
import java.awt.event.*;
/*<applet code="SwingExam.class" width = 100 height = 100 ></applet>*/

public class SwingExam extends JApplet implements MouseListener
{
    DefaultMutableTreeNode a1;
    DefaultMutableTreeNode b1;
    public void init()
    {
        Container con = this.getContentPane();
        String arr[] = {"hello", "hi"};
        JComboBox jb = new JComboBox(arr);
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("A");
        a1 = new DefaultMutableTreeNode("a1");
        top.add(a1);
        b1 = new DefaultMutableTreeNode("b1");
        top.add(b1);
        JTree tree = new JTree(top);
        tree.addMouseListener(this);
        
        con.setLayout(new FlowLayout());
        con.add(jb);
        con.add(tree);
    }
    public void mouseClicked(MouseEvent me)
    {
        System.out.println(me.paramString());
        if(me.getSource() == a1)
        {
            this.showStatus("a1 clicked");

        }
        else
        {
            this.showStatus("b1 clicked");
        }

    }
    public void mouseExited(MouseEvent me)
    {

    }
    public void mouseEntered(MouseEvent me)
    {

    }
    public void mouseReleased(MouseEvent me)
    {

    }
    public void mousePressed(MouseEvent me)
    {

    }
}