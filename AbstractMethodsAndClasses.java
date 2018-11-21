import java.util.*;
import java.lang.*;

abstract class ClassA
{
    abstract void methodForClass();
}

class ClassB extends ClassA
{
    void methodForClass()
    {
        System.out.println("Abstract method implemented");
    }
}

public class AbstractMethodsAndClasses
{
    public static void main(String args[])
    {
        ClassB b = new ClassB();
        b.methodForClass();
    }
}