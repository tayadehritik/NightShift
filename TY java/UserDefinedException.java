import java.util.*;
import java.lang.*;

class UserException extends Exception
{
    UserException(String msg){
        super(msg);
    }
}

public class UserDefinedException
{
    public static void main(String args[])
    {
        try{
            throw new UserException("Hello world");
        }
        catch(UserException e)
        {
            System.out.println(e);
        }

    }
}