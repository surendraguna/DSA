package LinkedList;

import java.util.Scanner;

public class LL
{
    public static Node read() {
        return head;
    }

    // Create Node Class
    public static class Node
    {
        // Declaration of variable
        public int data;
        public Node next;
        public Node()
        {

        }
        public Node(int data) // Creation of Node
        {
            this.data = data; // Assign value to Data in the Node
            this.next = null; // Make Node.next is null
        }
    }
    // Declare Head
    public static Node head = null;
    // Add Element At First
    public void addFirst(int data)
    {
        Node n = new Node(data); // Assign newNode to n
        /*if(head == null)
        {
            head = n;
            return;
        }*/
        n.next = head; // Add element to head
        head = n; // Head is pointing to new Node
    }
    // Add Element At Last
    public void addLast(int data)
    {
        Node n = new Node(data); // Creating a newNode
        if(head == null) // Check head is null or not
        {
            head = n;
            return;
        }
        Node temp = head;
        while(temp.next != null) // Moving pointer to last node
            temp = temp.next;
        temp.next = n; // Assign newNode to Last
    }
    //To Add At Random Location
    public void addRandom(int data, int l) {
        Node n = new Node(data);
        if(head == null && l == 0) // Check Node present or not
        {
            head = n;
            return;
        }
        if (l == 0) // Insert at First
        {
            n.next = head;
            head = n;
            return;
        }
        Node temp = head;
        for(int i = 1; i < l && temp != null; i++) // Finding desired Node to Insert
        {
            temp = temp.next;
        }
        if(temp == null) // Check desired Node present or not
            return;
        n.next = temp.next; // Assign Node in the Linked List
        temp.next = n;
    }
    // To remove at first
    public void removeFirst()
    {
        if(head == null) // Check
        {
            System.out.println("UnderFlow");
            return;
        }
        head = head.next; // Move Pointer to head.next(change head)
    }
    // To remove at Last
    public void removeLast()
    {
        if(head == null) // Check
        {
            System.out.println("UnderFlow");
            return;
        }
        if(head.next == null) // Delete second Node
        {
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != null) // Find last Node
            temp = temp.next;
        temp.next = null;
    }
    public void removeRandom(int k)
    {
        if(head == null)
        {
            System.out.println("UnderFlow"); // check Node present or not
            return;
        }
        if(k == 0) // Remove Node At first
        {
            head = head.next;
            return;
        }
        Node temp = head;
        for(int i = 1; i < k; i++) // Find Location
        {
            temp = temp.next;
        }
        if(temp == null || temp.next == null)
        {
            System.out.println("NO node present"); // Find node is empty or not
            return;
        }
        temp.next = temp.next.next; // Removing link
    }
    public void search(int x)
    {
        if(head == null) // Check Node present or not
        {
            System.out.println("UnderFlow");
            return;
        }
        Node temp = head;
        while(temp != null)
        {
            if(temp.data == x) // Found
            {
                System.out.println("Done");
                return;
            }
            temp = temp.next;
        }
        System.out.println("NOT"); // Not Found
    }
    // To Display Linked List
    public void display()
    {
        if(head == null)  // Check
        {
            System.out.println("UnderFlow!");
            return;
        }
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.data); // Display elements one by one
            temp = temp.next;
        }
    }
    // To display Node from another class
    public  static Node display(Node temp)
    {
        if(temp == null) // Check
            return null;
        System.out.println(temp.data); // Display elements one by one
        return display(temp.next);
    }
    // Main Function To Perform Actions
    public static void main(String args[])
    {
        LL l = new LL();
        Scanner s = new Scanner(System.in);
        System.out.println("Options: \n1. addFirst\n2. addLast\n3. addRandom\n4. removeFirst\n5. removeLast\n6. removeRandom\n7. search\n8. display\n9. Exit");
        int a = 1;
        while(a != 9)
        {
            System.out.println("Enter Option: ");
            a = s.nextInt();
            switch (a)
            {
                case 1 -> l.addFirst(s.nextInt());
                case 2 -> l.addLast(s.nextInt());
                case 3 -> l.addRandom(s.nextInt(), s.nextInt());
                case 4 -> l.removeFirst();
                case 5 -> l.removeLast();
                case 6 -> l.removeRandom(s.nextInt());
                case 7 -> l.search(s.nextInt());
                case 8 -> l.display();
                case 9 -> System.out.println("Out of program");
            }
        }
    }
}