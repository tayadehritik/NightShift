import java.util.*;
import java.lang.*;

public class ExceptionHandling
{
    public static void main(String args[])
    {
        try
        {
            throw new ArithmeticException();
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}