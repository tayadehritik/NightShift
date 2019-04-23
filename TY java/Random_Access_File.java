import java.io.*;

public class Random_Access_File
{
    public static void main(String args[])
    {
        try{
            RandomAccessFile f = new RandomAccessFile("input.txt", "rw");
            f.writeChar('x');
            System.out.println(f.readChar());

        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}