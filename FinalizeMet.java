import java.lang.*;
import java.util.*;

public class FinalizeMet
{
    public static void main(String args[])
    {
        FinalFor f = new FinalFor(1, 2);
        FinalFor c = new FinalFor(1, 4);
        f = c ;
        

        
    }
}

class FinalFor
{
    int a;
    int c;
    FinalFor(int a, int c)
    {
        this.a = a;
        this.c = c;
    }
    protected void finalize() throws Throwable
    {
        System.out.println(a);
        System.out.println(c);
    }
}