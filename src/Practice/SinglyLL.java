package Practice;

import java.util.LinkedList;
import java.util.Scanner;

public class SinglyLL
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        LinkedList<Integer> a = new LinkedList<>();
        a.addFirst(s.nextInt());
        a.addLast(s.nextInt());
        a.addLast(s.nextInt());
        a.addLast(s.nextInt());
        System.out.println(a.size());
    }
}
