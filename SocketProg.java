import java.net.*;

class SocketProg
{
    public static void main(String args[]) throws UnknownHostException
    {
        InetAddress  addr = InetAddress.getLocalHost();
        
        System.out.println(addr);    
        System.out.println(InetAddress.getPort());
    }
}