package Practice;

import LinkedList.*;

import java.util.Scanner;

public class LeaderInLinkedList
{
    static LL l = new LL(); // To create static object
    static LL.Node Head = null; // To Head of present class
    public static LL.Node leader()
    {
        if(l.head == null)
        {
            System.out.println("UnderFlow");
            return null;
        }
        Head = l.head; // Assign reference of head to Head
        LL.Node temp = Head; // Pointing reference to temp
        LL.Node max = null;
        LL.Node result = null;
        while(temp != null)
        {
            if(temp.next == null) // last is always in result
                max = temp;
            else
            {
                LL.Node index = temp.next;
                while (index != null)
                {
                    if(index.data < temp.data) // verify reference element is max element or not
                        max = temp;
                    else
                    {
                        max = null;
                        break;
                    }
                    index = index.next;
                }
            }
            if(max != null)
            {
                if(result == null)
                    result = new LL.Node(max.data); // create a node assign to  result
                else
                {
                    LL.Node n = new LL.Node(max.data); // createing a node
                    LL.Node c = result;
                    while (c.next != null) // finding last node
                    {
                        c = c.next;
                    }
                    c.next = n; // new node assign to last node
                }
            }
            temp = temp.next;
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a = 1;
        while(a != 0)
        {
            a = s.nextInt();
            switch (a)
            {
                case 0 -> System.out.println("OUT OF PROGRAM");
                case 1 -> l.addLast(s.nextInt());
                case 2 -> l.display();
                case 3 ->
                {
                    a :
                    {
                        LL.Node n = leader();
                        if(n == null)
                            break a;
                        l.display(n);
                    }

                }
            }
        }
    }
}
