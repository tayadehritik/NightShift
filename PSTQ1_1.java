import java.awt.*;
import java.applet.*;
public class PSTQ1_1 extends applet
{
    public void init()
    {
        Label l1 = new Label("hi");
        TextField tf = new TextField();
        CheckboxGroup cg = new CheckboxGroup();
        Checkbox c1 = new Checkbox("a",cg,false);
        Checkbox c2 = new Checkbox("b",cg,true);
        setLayout(new FlowLayout());
        add(l1);
        add(tf);
        add(c1);
        add(c2);
    }
} 