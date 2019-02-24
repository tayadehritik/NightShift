import java.util.*;
import java.math.BigInteger;
import java.io.*;

class chftired
{
	
	public static void main(String args[]) throws IOException
	{
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		datastruct darr[] = new datastruct[t];
		Random rand = new Random();
		for(int i=0;i<t;i++)
		{
			darr[i] = new datastruct();
			darr[i].a = sc.nextInt();
			darr[i].b = sc.nextInt();		
		}

		for(int i=0;i<t;i++)
			
		{
			System.out.println("YES");

				
		}	

			
	}
	public static datastruct action2(datastruct var,int d)
	{
		datastruct lab = new datastruct();
	
		lab.a = var.a + d;
		lab.b = var.b + (d-1);

		return lab;
	}
	public static datastruct action1(datastruct var,int d)
	{
		datastruct lab = new datastruct();
		
		lab.a = var.a + (d-1);
		lab.b = var.b + d;
		return lab;
	}
}

class datastruct
{
	
	int a;
	int b;

}
