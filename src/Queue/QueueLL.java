package Queue;

import java.util.Scanner;

public class QueueLL
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
    Node front = null;
    Node rear = null;
    void enQueue(int data)
    {
        Node n = new Node(data);
        if(rear == null && front == null)
        {
            front = rear = n;
            return;
        }
        rear.next = n;
        rear = n;
    }
    void deQueue()
    {
        if(front == null)
        {
            System.out.println("UnderFlow");
            return;
        }
        front = front.next;
    }
    void display()
    {
        if(front == null)
        {
            System.out.println("UnderFlow");
            return;
        }
        Node temp = front;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    int peek(){
        if(front == null)
            return -1;
        return front.data;
    }
    Object poll(){
        if(front == null)
            return null;
        int x = front.data;
        front = front.next;
        return x;
    }
    public static void main(String[] args)
    {
        QueueLL Q = new QueueLL();
        Scanner s = new Scanner(System.in);
        int a = 1;
        while(a != 0)
        {
            a = s.nextInt();
            switch (a)
            {
                case 1 -> Q.enQueue(s.nextInt());
                case 2 -> Q.deQueue();
                case 3 -> Q.display();
                case 4 -> System.out.println(Q.peek());
                case 5 -> System.out.println(Q.poll());
            }
        }
    }
}
