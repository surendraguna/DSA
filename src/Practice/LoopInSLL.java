package Practice;

import java.util.Scanner;

public class LoopInSLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    static void display()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    static boolean detectLoop()
    {
        Node slow = head; // Slow car
        Node fast = head.next; // Speed car
        while (fast != slow) // Loop detection
        {
            if(fast == null || fast.next == null)
                    return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
    static void removeLoop()
    {
        Node slow = head;
        Node fast = head.next;
        while (fast != slow) // find loop
        {
            if(fast == null || fast.next == null)
                return ;
            slow = slow.next;
            fast = fast.next.next;
        }
        int c = 1;
        fast = fast.next;
        while(fast != slow) // find size of loop
        {
            c++;
            fast = fast.next;
        }
        slow = head;
        fast = head;
        for(int i = 0; i < c - 1; i++) // Mov
            // ing fast to c distance
            fast = fast.next;
        while (fast.next != slow) // Find previous node slow node. slow node is a starting node of loop
        {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = head.next.next;
        Scanner s = new Scanner(System.in);
        int a = 1;
        while(a != 0)
        {
            a = s.nextInt();
            switch (a)
            {
                case 1 -> display();
                case 2 -> System.out.println(detectLoop());
                case 3 -> removeLoop();
            }
        }
    }
}
