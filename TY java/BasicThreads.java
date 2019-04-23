import java.util.*;
import java.lang.*;

class ThreadA extends Thread 
{
    ThreadA()
    {
        this.start();
    }
    
    public void run()
    {
        System.out.println("in thread a");
    }
}
class ThreadLink implements Runnable
{
    ThreadLink()
    {
        Thread X = new Thread(this);
        X.start();
    }
    public void run()
    {
        System.out.println("in thread b");
    }
}

public class BasicThreads
{
    public static void main(String args[])
    {
        ThreadA A = new ThreadA();
        ThreadLink Link = new ThreadLink();
       
        
    }
}