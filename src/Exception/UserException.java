package Exception;

class UserEx extends Exception
{
    UserEx(String msg)
    {
        super(msg);
    }
}
public class UserException
{
    public static void main(String[] args) throws UserEx {
        // Perform operation user defined exception
        int a  = 1;
        int b = 0;
        try
        {
            System.out.println(a/b);
        }
        catch (Exception e)
        {
            throw new UserEx("you baster");
        }
        System.out.println("Rest of code");
    }
}
