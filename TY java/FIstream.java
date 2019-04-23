import java.io.*;
import java.util.*;
import java.lang.*;

public class FIstream
{
    public static void main(String args[])
    {
        try{
            FileInputStream f = new FileInputStream("input.txt");
            int ch;
            while((ch=f.read())!= -1)
            {
                System.out.println((char) ch);
            }
            
        }
        catch(IOException l){
            System.out.println(l);
        }

    }
}