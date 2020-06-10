import java.util.*;
import java.io.*;
class xystr
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int k=0;k<t;k++)
		{
			String s = br.readLine();
			int pairs = getPairs(s);
			System.out.println(pairs);
		}
	
	}
	public static int getPairs(String s)
	{
		return 0;
	}
	
}
