package Practice;

import LinkedList.LL;

import java.util.Scanner;

public class ReverseLL
{
    static LL l = new LL();
    static void reverse(LL.Node Head)
    {
        // Reverse LinkedList
        /*LL.Node cur, prev;
        cur = prev = l.head;
        while(cur != null)
        {
            LL.Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        l.head.next = null;
        l.head = prev;*/

        // Reverse Display
       if(Head.next != null)
       {
           reverse(Head.next);
       }
       System.out.println(Head.data + " ");
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a = 1;
        while(a != 0)
        {
            System.out.println("Enter Options:");
            a = s.nextInt();
            switch (a)
            {
                case 1 -> l.addLast(s.nextInt());
                case 2 -> l.display();
                case 3 -> reverse(l.head);
            }
        }
    }
}
