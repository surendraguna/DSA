package Stack;

import java.util.Scanner;

public class StackLL
{
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    static Node top = null;
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
    int search(int i)
    {
       Node temp = top;
       int c = 1;
       while (temp != null)
       {
           if (temp.data == i)
               return c;
           c++;
           temp = temp.next;
       }
       return -1;
    }
    int peek()
    {
        if(top == null)
            return -1;
        return top.data;
    }
    boolean empty()
    {
        if(top == null)
            return true;
        return false;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        StackLL S = new StackLL();
        int a = 1;
       S.push(1);
       S.push(2);
       S.push(3);
       S.push(4);
        while(a != 0)
        {
            System.out.println("Enter Option:");
            a = s.nextInt();
            switch(a)
            {
                case 1 -> S.push(s.nextInt());
                case 2 -> S.pop();
                case 3 -> System.out.println(S.peek());
                case 4 -> System.out.println(S.search(s.nextInt()));
                case 5 -> S.display();
                case 6 -> System.out.println(S.empty());
            }
        }

    }
}
