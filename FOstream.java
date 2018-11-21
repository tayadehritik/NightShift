import java.util.*;
import java.io.*;
import java.lang.*;

public class FOstream
{
    public static void main(String args[])
    {
        try{
            FileOutputStream f = new FileOutputStream("output.txt");
            FileInputStream nf = new FileInputStream("input.txt");
            int ch;
            while((ch = nf.read())!=-1){
                f.write(ch);
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}