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
		int n = s.length();
		char arr[] = s.toCharArray();
		int pairs = 0;
		Queue<Character> queue = new LinkedList<>();
		for(int i=0;i<arr.length;i++)
		{
			try
			{
				int head = queue.peek();
			
				
				if(arr[i] != head)
				{
					queue.add(arr[i]);
				}
				
				/*System.out.println(queue);*/
				if(queue.size() == 2)
				{
					queue.remove();
					queue.remove();
					pairs = pairs + 1;
					
				}

			}
			catch(NullPointerException e)
			{
				queue.add(arr[i]);
				/*System.out.println(queue);*/
			}
			
		}
		return pairs;
	}

	
}
