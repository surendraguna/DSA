package DoubleLinkedList;

import java.util.Scanner;

public class DL
{
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
        if(head == null)
        {
            head = n;
            return;
        }
        Node temp = head;
        while(temp.next != null)
            temp = temp.next;
        temp.next = n;
        n.prev = temp;
    }
    void addRandom(int data, int l)
    {
        Node n = new Node(data);
        if(head == null && l == 0)
        {
            head = n;
            return;
        }
        if(l > 0 && head == null)
        {
            System.out.println("NOT possible");
            return;
        }
        if(l == 0)
        {
            head.prev = n;
            n.next = head;
            head = n;
            return;
        }
        Node temp = head;
        while(l > 1)
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
        while(a != 9)
        {
            a = s.nextInt();
            switch (a)
            {
                case 0 -> l.display();
                case 1 -> l.addFirst(s.nextInt());
                case 2 -> l.addLast(s.nextInt());
                case 3 -> l.addRandom(s.nextInt(), s.nextInt());
            }
        }
    }
}