import java.lang.*;
import java.util.*;

class A
{
    A()
    {
        System.out.println("this is class A");
    }
}
class B extends A
{
    B()
    {
        
        super();
    }
}



public class InheritanceWithSuper
{

    public static void main(String args[])
    {
        A a = new A();
        B b = new B();
    }
}