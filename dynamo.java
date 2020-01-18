import java.util.*;
import java.math.*;

class dynamo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int t = sc.nextInt();
        for(int k=0;k<t;k++)
        {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int s = (int) Math.pow(10,n);
            s = s * 5;
            s = (int) rand.nextInt((int) s-1)+1;
            System.out.println(s);
            System.out.flush();
        }

    }
}