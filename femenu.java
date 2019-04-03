import java.util.*;
import java.awt.*;


class femenu extends Frame
{
    public static void main(String args[])
    {
        femenu f = new femenu();
        MenuBar mbr = new MenuBar();
        Menu hell = new Menu("File");
        CheckboxMenuItem cb = new CheckboxMenuItem("hi");
        hell.add(cb);
        mbr.add(hell);
        f.setMenuBar(mbr);
        f.setVisible(true);

    }
}