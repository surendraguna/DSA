package Exception;

import java.util.Scanner;

public class Division
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a = 1;
        int b = s.nextInt();
        int c = 0;
        try
        {
            c = a/b;
            //System.exit(0);
        }
        catch(ArithmeticException e)
        {
            // remember throws
            //System.out.println("Exception Occurred ");
            //System.out.println("You baster don't divide with zero");
            //System.exit(0);
            throw new ArithmeticException("You baster"); // Change Message
        }
        finally
        {
            System.out.println(c);
        }
        System.out.println("Hi man");

    }
}
