import java.net.*;
import java.io.*;

class DatagramListener
{
    public static void main(String args[]) throws SocketException, IOException
    {
        DatagramSocket ds = new DatagramSocket(3000);
        byte[] buff = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buff,1024);
        ds.receive(dp);
        String rmess = new String(dp.getData(), dp.getLength());
        System.out.println(rmess);
        ds.close(); 

    }
}