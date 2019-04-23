import java.util.*;
import java.io.*;
import java.lang.*;

public class MathFun 
{
    public static void main(String args[])
    {
        System.out.println("Math functions performed\n");
        int a = Math.min(2, 3);
        System.out.println(a);
        int b = Math.max(3,2);
        System.out.println(b);
        double c = Math.pow(2, 2);
        System.out.println("pow"+c);
        double d = Math.sqrt(4.000);
        System.out.println("sqrt "+d);
        double f = Math.round(3.123);
        System.out.println("round "+f);
        int g = Math.abs(-4);
        System.out.println(g);

    }
}