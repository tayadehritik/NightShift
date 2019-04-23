import java.util.*;
import java.lang.*;

public class Vectors
{
    public static void main(String argsp[])
    {
        Vector v = new Vector();
        v.addElement(new Integer(1));
        System.out.println(v.elementAt(0));
        v.add(1,new Integer(2));
        System.out.println(v.size());
    }
}