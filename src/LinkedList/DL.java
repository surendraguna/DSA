package LinkedList;

import java.util.Scanner;

public class DL
{
    //Creating Node class for Double Linked list;
    class Node
    {
        // Declaration of Node variables
        int data;
        Node prev;
        Node next;
        Node(int data) // Creation of Node
        {
            this.data = data; // Assign data to data variable
            this.prev = this.next = null; // Assign next as null
        }
    }
    Node head = null;
    void addFirst(int x)
    {
        Node n = new Node(x); // Creation of newNode
        if(head == null) // Check head is null or not
        {
            head = n; // Assign newNode to head
            return;
        }
        n.next = head; // Assign newNode next to head
        head.prev = n; // To store newNode in head
        head = n; // Move head point to newNode
    }
    void addLast(int x)
    {
        Node n = new Node(x);
        if(head == null) // Here No head then assign to head
        {
            head = n;
            return;
        }
        Node temp = head;
        while(temp.next != null) // Move pointer ti last
            temp = temp.next;
        temp.next = n;
        n.prev = temp;
    }
    void addRandom(int data, int l)
    {

        if(l > 0 && head == null) // here head is null and Location more than 0
        {
            System.out.println("NOT possible");
            return;
        }
        Node n = new Node(data);
        if(head == null && l == 0) // head is null but l is o
        {
            head = n;
            return;
        }
        if(l == 0) // Insert at begin
        {
            head.prev = n;
            n.next = head;
            head = n;
            return;
        }
        Node temp = head;
        while(l > 1) // Find desired location
        {
            temp = temp.next;
            l--;
        }
        if(temp == null)
            return;
        n.next = temp.next;
        n.prev = temp;
        temp.next = n;
    }
    void removeFirst()
    {
        if(head == null) // if head == null nothing to remove
        {
            System.out.println("UnderFlow");
            return;
        }
        head = head.next; // Change head to head.next
    }
    void removeLast()
    {
        if(head == null)
        {
            System.out.println("UnderFlow");
            return;
        }
        if(head.next == null) // head contains one node then remove node
        {
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != null) // find the last before node
        {
            temp = temp.next;
        }
        temp.next = null; // remove last node link
    }
    void removeRandom(int l)
    {
        if(head == null)
        {
            System.out.println("UnderFLow");
            return;
        }
        if(l == 0) // head point to head next
        {
            head = head.next;
            return;
        }
        Node temp = head;
        while(l > 1) // find previous node of delete node
        {
            System.out.println(temp.data);
            temp = temp.next;
            l--;
        }
        if(temp == null || temp.next == null)
        {
            System.out.println("NO node present");
            return;
        }
        temp.next = temp.next.next; // RemoveRandom is done
    }
    void reverse()
    {
        Node temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }
    void display()
    {
        if(head == null)
        {
            System.out.println("UnderFlow");
            return;
        }
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        DL l = new DL();
        int a = 0;
        while(a != 10)
        {
            System.out.println("Enter Option:");
            a = s.nextInt();
            switch (a)
            {
                case 0 -> l.display();
                case 1 -> l.addFirst(s.nextInt());
                case 2 -> l.addLast(s.nextInt());
                case 3 -> l.addRandom(s.nextInt(), s.nextInt());
                case 4 -> l.removeFirst();
                case 5 -> l.removeLast();
                case 6 -> l.removeRandom(s.nextInt());
                case 7 -> l.reverse();
            }
        }
    }
}