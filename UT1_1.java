import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
class UT1_1 extends JFrame  
{
    UT1_1()
    {
        this.setLayout(new FlowLayout());
        MenuBar mb = new MenuBar();
        this.setMenuBar(mb);
        Menu m1 = new Menu("File");
        Menu m2 = new Menu("Edit");
        
        CheckboxMenuItem m11 = new CheckboxMenuItem("hello",false);
        String[] var = {"hi2","h2","h3"};
        JComboBox jb = new JComboBox(var);
        m1.add(m11);

        mb.add(m1);
        mb.add(m2);
        this.add(jb);
        Button b1 = new Button("hi");
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox c1 = new Checkbox("male",cbg,true);
        Checkbox c2 = new Checkbox("femal",cbg, false);
        Scrollbar s = new Scrollbar(Scrollbar.HORIZONTAL,50,2,0,100);
        s.addAdjustmentListener(new AdjLis());
        Winad win = new Winad(this);
        this.addWindowListener(win);

        DefaultMutableTreeNode top = new DefaultMutableTreeNode("top");
        DefaultMutableTreeNode t1 = new DefaultMutableTreeNode("t1");
        top.add(t1);
        JTree tree = new JTree(top);
        this.add(tree);    
        JProgressBar jpg = new JProgressBar();
        
        TextField tf = new TextField("hwlloo");
        TextArea ta = new TextArea();
        tf.setEditable(true);
        jpg.setValue(50);
        this.add(b1);
        this.add(jpg);
        this.add(c1);
        this.add(c2);
        this.add(s);
        this.add(tf);
        this.add(ta);
        this.setSize(400,400);
        this.setVisible(true);
        b1.addActionListener(new ActList());
        c1.addItemListener(new ItemCl());
    }
    
    public static void main(String args[])
    {
        UT1_1 abc = new UT1_1();

    }
}
class Winad extends WindowAdapter
{
    UT1_1 var;
    Winad(UT1_1 var)
    {
        this.var = var;
    }
    public void windowClosing(WindowEvent we)
    {
        var.setVisible(false);
    }

}

class ActList implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        System.out.println(e.getSource());
    }
}

class ItemCl implements ItemListener
{
    public void itemStateChanged(ItemEvent e)
    {
        System.out.println(e.getSource());
    }
}

class AdjLis implements AdjustmentListener
{
    public void adjustmentValueChanged(AdjustmentEvent ae)
    {
        System.out.println(ae.getSource());
    }
}