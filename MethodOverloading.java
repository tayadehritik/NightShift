import java.lang.*;
import java.util.*;

class ForOverloading
{
    ForOverloading(int a, int b)
    {
        System.out.println(b);

    }
    ForOverloading(int b)
    {
        System.out.println(b);
    }
    public void Metho(int a, int b)
    {
        System.out.println(a);
    }
    public void Metho(int a)
    {
        System.out.println(a);
    }
}



public class MethodOverloading
{
    public static void main(String args[])
    {
        ForOverloading f = new ForOverloading(2, 1);
        ForOverloading s = new ForOverloading(2);
        f.Metho(2);
        s.Metho(2, 1);

    }
}
