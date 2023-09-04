package Stack;

import java.util.Scanner;

public class StackLL
{
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    Node top = null;
    void push(int data)
    {
        Node n = new Node(data); // Create a Node
        if(top == null) // top == null -> top == n.
        {
            top = n;
            return;
        }
        n.next = top; // New Node next is top
        top = n; // top = new Node
    }
    void pop()
    {
        if(top == null)
        {
            System.out.println("UnderFlow");
            return;
        }
        top = top.next; // Change the top
    }
    void display()
    {
        if(top == null)
        {
            System.out.println("UnderFlow");
            return;
        }
        Node temp = top;
        while (temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        StackLL S = new StackLL();
        int a = 1;
        while(a != 0)
        {
            a = s.nextInt();
            switch(a)
            {
                case 1 -> S.push(s.nextInt());
                case 2 -> S.pop();
                case 3 -> S.display();
            }
        }

    }
}
