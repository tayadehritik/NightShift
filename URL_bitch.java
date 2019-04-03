import java.net.*;
import java.io.*;

class URL_bitch
{
    public static void main(String args[]) throws MalformedURLException, IOException, UnknownHostException
    {
        URL u1 = new URL("https://www.github.com/");

        System.out.println("To string: "+ u1.toString());
        System.out.println("Host :"+u1.getHost());
        System.out.println("Protocol: "+ u1.getProtocol());
        System.out.println("Port :"+u1.getDefaultPort());
        
        /*URLConnection urlc = u1.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(urlc.getInputStream()));
        String i;
        while( (i=br.readLine()) != null)
        {
            System.out.println(i);
        }*/
        String url = "www.github.com";

        InetAddress ia = InetAddress.getByName(url);
        System.out.println(ia.getHostAddress());


    }
}