import java.util.*;
import java.lang.*;
import java.awt.*;
import java.applet.*;
public class ParameterPassing extends Applet
{
    public void init()
    {
        String name = this.getParameter("param1");
        this.setBackground(Color.WHITE);
        this.setForeground(Color.red);
        
        Font f = new Font("Serif", Font.BOLD|Font.ITALIC, 15);
        
        this.setFont(f);
    }
    public void paint(Graphics g)
    {
        String name = this.getParameter("param1");
        g.drawString(name, 100, 100);
        
    }   
    
}
/*<applet code=ParameterPassing.class width=900 height=900>

    <param name="param1" value= "hritik"></param>

</applet>*/