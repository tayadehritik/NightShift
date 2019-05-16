import java.net.*;
import java.util.*;
import java.io.*;
class networking
{
	public static void main(String args[]) throws IOException,  UnknownHostException, ConnectException
	{
		if(Integer.parseInt(args[0]) == 1)
		{
				
			ServerSocket sc = new ServerSocket(5000);
			Socket scc = sc.accept();
			BufferedReader br = new BufferedReader(new InputStreamReader(scc.getInputStream()));
			int ch;
			System.out.println("here");
			while((ch=br.read())!=-1)
			{
				System.out.println((char) ch);
			}
			System.out.println("here too");
		}
		else
		{
			Socket sc = new Socket("127.0.0.1",5000);
			BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream()));
			PrintWriter pw = new PrintWriter(sc.getOutputStream(),true);
			pw.println("hello");
			pw.println("hi");

		
		}
	
	}
	
}
