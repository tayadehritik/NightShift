import java.util.*;
import java.math.*;
import java.lang.*;
class dynamo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       	int abc = convert(3);
        int t = sc.nextInt();
        for(int k=0;k<t;k++)
        {
            int n = sc.nextInt();
            int a = sc.nextInt();
            
        }

    }

    public static int convert(int a)
    {
	StringBuilder s = new StringBuilder("");;
	for(int i=0;i<a;i++)
	{
		s.append("9");
	}
	
	int retnum = Integer.parseInt(s.toString());
	System.out.println(retnum);
    	return retnum;
    }
}
