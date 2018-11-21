import java.util.*;
import java.lang.*;

public class Fibo
{
    public static void main(String args[])
    {
        System.out.println("enter number for fibonacci series");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int f=0;
        for(int i=0;i<=a;i++)
        {
            f = fibonacci(i);
            System.out.println(f);
        }
    }

    public static int fibonacci(int a)
    {
        if(a == 0)
        {
            return 0;
        }
        else if(a == 1)
        {
            return 1;
        }
        else{
            return fibonacci(a-1) + fibonacci(a-2);
        }

    }

}