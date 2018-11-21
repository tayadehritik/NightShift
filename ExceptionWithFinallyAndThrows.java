import java.util.*;
import java.lang.*;

public class ExceptionWithFinallyAndThrows
{
    public static void main(String args[]) 
    {
                System.out.println("hellow world");
                try
                {
                    throwone();
                }
                catch(ArithmeticException e)
                {
                    System.out.println(e);
                }
                finally
                {
                    System.out.println("in finallY");
                }
    }
    static void throwone() throws ArithmeticException
    {
        System.out.println("fa'");
        throw new ArithmeticException();
    }

}