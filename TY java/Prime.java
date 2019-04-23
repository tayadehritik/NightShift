import java.util.*;
import java.lang.*;

public class Prime
{
    public static void main(String args[])
    {
        System.out.println("enter range for prime number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=2;i<=num;i++)
        {
            int flag = 0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag = 1;
                    break;
                }
                else{
                    flag = 0;
                }
            }
            if(flag == 0){
                System.out.println(i);
            }

        }
    }
}