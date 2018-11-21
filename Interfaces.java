import java.util.*;
import java.lang.*;

interface InterfaceA 
{
    public abstract void methodForInterfaceA();
}
interface InterfaceB extends InterfaceA
{
    public abstract void methodForInterfaceB();
}

class ClassA
{
    void methodForClassA(){
        System.out.println("in method for Class A");
    }
}
class ClassB extends ClassA implements InterfaceA, InterfaceB
{
    public void methodForInterfaceA()
    {
        System.out.println("In method for interface A");
    }
    public void methodForInterfaceB()
    {
        System.out.println("In method for interface B");
    }
}


public class Interfaces
{
    public static void main(String args[])
    {
        System.out.println("Multiple Inheritance usign interfaces");
        ClassB b = new ClassB();
        b.methodForInterfaceA();
        b.methodForInterfaceB();
        b.methodForClassA();        
    }
}