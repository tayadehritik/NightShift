import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
import java.util.NoSuchElementException;



import java.math.*;
import java.util.Set;
public class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arg = sc.nextInt();
        for(int i=0;i<arg;i++)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            Set<Integer> arrli = new HashSet<Integer>(); 
            for(int j =0 ;j<n;j++)
            {
                arr[j] = sc.nextInt();
                BigInteger b = new BigInteger(String.valueOf(arr[j]));
                if(b.isProbablePrime(1))
                {
                    arrli.add(arr[j]);
                }
            }
            
            
            
            Iterator it = arrli.iterator();
            ArrayList<Integer> arr5 = new ArrayList<Integer>();
            for(Integer l: arrli)
            {
                int flag =0;
                
                for(int k =0;k<arr.length;k++)
                {
                    if(arr[k]%(int) l !=0)
                    {
                        flag = 0;
                        break;
                    }
                    else{
                        flag = 1;
                    }
                }
                if(flag == 1)
                {
                    arr5.add(l);
                }
            }
        
            System.out.println(arr5.size()*n);
                
            
            
            

            
            
        }
    }
}