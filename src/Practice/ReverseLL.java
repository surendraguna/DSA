package Practice;

import static LinkedList.LL.*;

import java.util.Scanner;

public class ReverseLL
{
    static void reverse()
    {
        // Reverse LinkedList
        Node cur, prev;
        cur = head;
        prev = null;
        while(cur != null)
        {
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
    }
    static void recursiveReverse(Node cur){
        if(cur == null)
            return;
        if(cur.next == null){
            head = cur;
            return;
        }
        recursiveReverse(cur.next);
        cur.next.next = cur;
        cur.next = null;

    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next= new Node(5);
        head.next.next.next.next.next = new Node(6);
        int a = 1;
        while(a != 0)
        {
            System.out.println("Enter Options:");
            a = s.nextInt();
            switch (a)
            {
                //case 1 -> l.addLast(s.nextInt());
                case 2 -> display(head);
                case 3 -> reverse();
                case 4 -> recursiveReverse(head);
            }
        }
    }
}
