import java.net.*;
import java.io.*;

class DatagramProg 
{
    public static void main(String args[]) throws IOException, SocketException
    {
        DatagramSocket ds = new DatagramSocket();
        String mess = "hello";
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        DatagramPacket dp = new DatagramPacket(mess.getBytes(),mess.length(), ip,3000);
        ds.send(dp);
        ds.close();
    }
}