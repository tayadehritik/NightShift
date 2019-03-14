import java.util.*;
import java.math.*;
class chfdiger
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int k=0;k<t;k++)
		{
			int n = sc.nextInt();
			int d = sc.nextInt();
			String ns = Integer.toString(n);	
			String ds = Integer.toString(d);
			int len = ns.length();
			int small = n;
			char[] Arr = new char[ns.length()+1];
			ns.getChars(0,ns.length(),Arr,0);
			Data data = new Data(Arr, len, ds.charAt(0));
			String ls = data.append();
		
			for(int i=0;i<len;i++)
			{
				
				int val = data.remove(ls,i);	
				if(val<small)
				{
					small = val;
				}	
			}
			System.out.println(small);		
		}	
	
	}
}

class Data
{
	char[] val;
	char ds;
	int len;
	Data(char[] arr, int l, char d)
	{
		val = arr;
		ds = d;
		len = l;
	}
	public String append()
	{
		val[len] = ds;
		String ret = new String(val);
		return ret;
	}
	public int remove(String s,int index)
	{
		
		char[] arr = new char[len+1];
		s.getChars(0,len+1,arr,0);
		for(int i=index;i<len;i++)
		{
			arr[i] = arr[i+1];
		}
			
		String abc = new String(arr);
		String news = abc.substring(0,len);
		System.out.println(news);	

		return Integer.parseInt(news);
	}
}
