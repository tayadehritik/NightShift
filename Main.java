import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

import java.util.Map;

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
            
            
            
        
           int p = 0;
           Map m = new HashMap<>();
           for(int l: arrli)
           {

               
               Vector v = new Vector<>();
               for(int k =0;k<n;k++)
               {
                   if(arr[k]%(int) l ==0)
                   {
                       v.add(arr[k]);

                   }
               }
               
              m.put(l,v);
               
               

           }
            int max=0;
for(Object keys: m.keySet()){
   Vector max2  = (Vector) m.get(keys);

           Set<Integer> newarrli = new HashSet<Integer>(); 
                
           for(int j =0 ;j<max2.size();j++)
           {
               
               BigInteger b = new BigInteger(String.valueOf(max2.elementAt(j)));
               if(b.isProbablePrime(1))
               {
                   
                   newarrli.add((int) max2.elementAt(j));
               }
           }
           
           ArrayList<Integer> arr5 = new ArrayList<Integer>();
            for(Integer l: newarrli)
            {
                int flag =0;
                
                for(int k =0;k<max2.size();k++)
                {
                    if((int) max2.elementAt(k)%(int) l !=0)
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
            
            int curr = arr5.size()*max2.size();
            if(curr > max)
            {
                max = curr;
            }
            
            
        }
        System.out.println(max);
            
            
        }
    }
}