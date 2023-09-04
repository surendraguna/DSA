package Practice;

import java.util.Scanner;
import LinkedList.*;
public class SortLL
{
    static LL l = new LL();
    static LL.Node Head = null;
    static void Sort()
    {
        Head = l.head;
        if(Head == null)
            return;
        LL.Node temp = Head; // Taking temp as reference
        while(temp != null)
        {
            LL.Node index = temp.next;
            while(index != null)
            {
                if(temp.data > index.data)
                {
                    int t = temp.data;
                    temp.data = index.data;
                    index.data = t;
                }
                index = index.next;
            }
            temp = temp.next;
        }
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a = 1;
        while(a != 0)
        {
            a = s.nextInt();
            switch(a)
            {
                case 0 -> System.out.println("OUT OF PROGRAM");
                case 1 -> l.addLast(s.nextInt());
                case 2 -> Sort();
                case 3 -> l.display();
            }
        }
    }
}
