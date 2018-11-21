import java.util.*;
import java.lang.*;

class Stat
{
    public static int Met1()
    {
        System.out.println("this is a static method");
        return 0;
    }
}
public class StaticMembers
{
    public static void main(String args[])
    {
        Stat.Met1();
    }
}