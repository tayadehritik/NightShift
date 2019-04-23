import java.lang.*;
import java.util.*;

class ClassA
{
    public void methodForClass()
    {
        System.out.println("We are in ClassA");
    }
}
class ClassB extends ClassA
{
    public void methodForClass()
    {
        System.out.println("We are in ClassB");

    }
}

public class MethodOverridingWithDynamicDispatch
{
    public static void main(String args[])
    {
        ClassA obj;
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        obj = a;
        obj.methodForClass();
        obj = b;
        obj.methodForClass();
    }
}