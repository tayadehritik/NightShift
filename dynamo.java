import java.util.*;
import java.math.*;
import java.lang.*;
import java.io.*;
class dynamo
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();

        for(int k=0;k<t;k++)
        {
		
            int n = sc.nextInt();
            long a = sc.nextLong();
	    long retnum = convert(n);
	    
    	    long s = a + retnum + retnum;	    
            System.out.println(s);
	    System.out.flush(); 
	    long b = sc.nextLong();
	    long c = retnum - b;
	    System.out.println(c);
	    System.out.flush();
	    long d = sc.nextLong();
	    long e = retnum - d;
	    System.out.println(e);
	    System.out.flush();

	   	
	    int finaln = sc.nextInt();
	    if(finaln == -1)
	    {
		System.exit(1);
	    	break;
	    }

	    
	
        }
	System.out.close();
	sc.close();

    }

    public static long convert(int a)
    {
	StringBuilder s = new StringBuilder("");;
	for(int i=0;i<a;i++)
	{
		s.append("9");
	}
	
	long retnum = Integer.parseInt(s.toString());
    	return retnum+1;
    }
}
