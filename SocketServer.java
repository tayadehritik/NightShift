import java.net.*;
import java.io.*;

class SocketServer
{
    public static void main(String args[]) throws IOException, UnknownHostException
    {
        ServerSocket ss = new ServerSocket(5555);
        Socket ls = ss.accept();
        System.out.println("connection accepted");
        DataInputStream din = new DataInputStream(ls.getInputStream());
        DataOutputStream dout = new DataOutputStream(ls.getOutputStream());
        while(true)
        {
            String mess = din.readUTF();
            System.out.println(mess);
            if(mess.equals("hello"))
            {
                dout.writeUTF("hi there");
                dout.flush();
            }
            else
            {
                dout.writeUTF("invalid greeting");
                dout.flush();
            }
            
        }   

        
         
    }
}