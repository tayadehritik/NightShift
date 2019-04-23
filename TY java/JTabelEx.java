import javax.swing.*;
import java.util.*;
import java.applet.*;
import java.awt.*;
/*<applet code="JTabelEx.class" width=100 height=100 ></applet>*/

public class JTabelEx extends JApplet
{
    public void init()
    {
        Container con = this.getContentPane();
        con.setLayout(new FlowLayout());
        JButton b= new JButton("hee");
        String[] abc = {"jo","ji"};
        Object[][] col = {
            {"ji1","j2i"},
            {"j32i","kfsd"}
        };

        JTable jt = new JTable(col,abc);

        int v;
        int h;
        v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane jp = new JScrollPane(jt,v,h);
        con.add(jp);

        con.add(b);
    }
}