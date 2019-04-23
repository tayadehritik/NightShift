import java.lang.*;
import java.util.*;

public class ArraysAndStrings
{
    public static void main(String args[])
    {
        int arr[] = new int[5];
        for(int i = 0;i<5;i++)
        {
            arr[i] = i;
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }
        String a = new String("Hello");
        String b = new String("World");
        System.out.println(a.equals(b));
        System.out.println(a.compareTo(b));
        System.out.println(a.charAt(2));
        System.out.println(a.substring(1,4));
        System.out.println(a.indexOf("e"));
        System.out.println(a.concat(b));

        StringBuffer sb = new StringBuffer("HEllo World");
        System.out.println(sb.capacity());
    }
}