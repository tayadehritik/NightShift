import java.awt.*;
import java.applet.*;
/*<applet code="one.class" width=400 height=400></applet>*/
public class one extends Applet
{
    
    public void init()
    {
        this.setLayout(new BorderLayout());
        Button b = new Button("hi");
        Label l = new Label("hello");
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox cb1 = new Checkbox("male",cbg,true);
        Checkbox cb2 = new Checkbox("female",cbg, false);
        List li = new List();
        Choice c = new Choice();
        c.add("bitch");
        c.add("hey there");
        add(c, BorderLayout.SOUTH);
        li.add("hello");
        li.add("hi");
        add(li,BorderLayout.NORTH);
        add(b,BorderLayout.CENTER);
        add(l,BorderLayout.CENTER);
        add(cb1,BorderLayout.EAST);
        add(cb2,BorderLayout.EAST);
    }
}