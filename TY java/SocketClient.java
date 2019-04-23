import java.net.*;
import java.io.*;

class SocketClient
{
    public static void main(String args[]) throws UnknownHostException, IOException
    {
        Socket ss = new Socket("localhost",5555);
        System.out.println("connected");
        DataInputStream din = new DataInputStream(ss.getInputStream());
        DataOutputStream dout = new DataOutputStream(ss.getOutputStream());
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        while(true)
        {
            String hello = input.readLine();
            
            dout.writeUTF(hello);
            dout.flush();

            String reply = din.readUTF();
            System.out.println(reply);
        }

        
    }
}