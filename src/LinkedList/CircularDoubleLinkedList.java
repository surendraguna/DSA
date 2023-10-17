package LinkedList;

import java.util.Scanner;

public class CircularDoubleLinkedList {
    static class Node{
        int data;
        Node prev, next;
        Node(int data){
            this.data = data;
            prev = next = null;
        }
    }
    static Node head = null;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        do{
            System.out.println("Enter Option: ");
            a = s.nextInt();
            switch (a){
                case 1 -> insertionAtFirst(s.nextInt());
                case 2 -> insertionAtLast(s.nextInt());
                case 4 -> removeAtFirst();
                case 5 -> removeAtLast();
                case 7 -> display();
            }
        }while (a != 0);
    }

    private static void removeAtLast() {
        if(head == null){
            System.out.println("UnderFLow");
            return;
        }
        if(head.next == head){
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != head)
            temp = temp.next;
        temp.next = head;
        head.prev = temp;
    }

    private static void removeAtFirst() {
        if(head == null){
            System.out.println("UnderFlow");
            return;
        }
        if(head.next == head){
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next != head)
            temp = temp.next;
        head = head.next;
        temp.next = head;
        head.prev = temp;

    }

    private static void insertionAtLast(int i) {
        Node n = new Node(i);
        if(head == null){
            head = n;
            n.next = head;
            n.prev = head;
            return;
        }
        Node temp = head;
        while(temp.next != head)
            temp = temp.next;
        temp.next = n;
        n.prev = temp;
        n.next = head;
    }

    private static void display() {
        if(head == null){
            System.out.println("UnderFlow");
            return;
        }
        Node temp = head;
        do{
            System.out.println(temp.data);
            temp = temp.next;
        }while(temp != head);
    }

    private static void insertionAtFirst(int i) {
        Node n = new Node(i);
        if(head == null){
            head = n;
            n.next = head;
            n.prev = head;
            return;
        }
        Node temp = head;
        while(temp.next != head)
            temp = temp.next;
        temp.next = n;
        head.prev = n;
        n.next = head;
        head = n;
    }
}
