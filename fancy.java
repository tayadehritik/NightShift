import java.util.*;
import java.io.*;
class fancy 
{
	public static void main(String args[]) throws IOException
	{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
	
		for(int i=0;i<t;i++)
		{
		
			String s = br.readLine();
			String arr[] = s.split("\\s+");
			
			boolean f = false;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j].equals("not"))
				{
					System.out.println("Real Fancy");
					f = true;
					break;
				}
			}

			if(f == false)
			{
				System.out.println("regularly fancy");
			}
			
		}
		
		
	
	}
}
