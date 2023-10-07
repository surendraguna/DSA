package Practice;

import static Practice.MakeTwoLinkedList.head;
import static Practice.MakeTwoLinkedList.print;
import static Practice.MakeTwoLinkedList.Node;

public class SwapAlter {
    static void swapElements(Node head){
        Node temp = head;
        while(temp != null && temp.next != null){
            int data = temp.data;
            temp.data = temp.next.data;
            temp.next.data= data;
            temp = temp.next.next;
        }
        System.out.println();
        print(head);
    }
    static Node swapNode(Node head){
        // Using Recursion
        if(head == null || head.next == null)
            return head;
        Node temp = head.next;
        head.next = swapNode(head.next.next);
        temp.next = head;
        return temp;
    }
    public static void main(String[] args) {
        head = new MakeTwoLinkedList.Node(1);
        head.next = new MakeTwoLinkedList.Node(2);
        head.next.next= new MakeTwoLinkedList.Node(3);
        head.next.next.next = new MakeTwoLinkedList.Node(4);
        head.next.next.next.next = new MakeTwoLinkedList.Node(5);
        head.next.next.next.next.next = new MakeTwoLinkedList.Node(6);
        //head.next.next.next.next.next.next = new MakeTwoLinkedList.Node(7);
        print(head);
        //swapElements(head);
        head = swapNode(head);
        System.out.println();
        print(head);
    }
}
