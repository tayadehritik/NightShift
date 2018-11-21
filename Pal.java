import java.io.*;
import java.util.*;

public class Pal
{
    public static void main(String args[])
    {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = a;
        while(a>0)
        {
            remainder = a % 10;
            result = result * 10 + remainder;
            num = num /10;

        }
        

    }
}