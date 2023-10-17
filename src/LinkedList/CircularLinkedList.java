package LinkedList;

import java.util.Scanner;

public class CircularLinkedList {
    // Insertion at random index starts from zero
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head = null;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CircularLinkedList c = new CircularLinkedList();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head;
        int a;
        do{
            System.out.println("Enter Option: ");
            a = s.nextInt();
            switch (a){
                case 1 -> c.insertionAtFirst(s.nextInt());
                case 2 -> c.insertionAtLast(s.nextInt());
                case 3 -> c.insertionAtRandom(s.nextInt(), s.nextInt());
                case 4 -> c.removeAtFirst();
                case 5 -> c.removeAtLast();
                case 6 -> c.removeAtRandom(s.nextInt());
                case 7 -> System.out.println(c.search(s.nextInt()));
                case 8 -> c.display();
            }

        }while(a != 0);

    }
    void insertionAtRandom(int data, int l){
        if(l == 0){
            insertionAtFirst(data);
            return;
        }
        if(head == null && l > 0){
            System.out.println("Unable to insert");
            return;
        }
        Node n = new Node(data);
        Node temp = head;
        while(temp.next != head && l > 1){
            temp = temp.next;
            l--;
        }
        if(l == 1){
            n.next = temp.next;
            temp.next = n;
            return;
        }
        System.out.println("Unable to Insert");
    }
    void removeAtRandom(int l){
        if(head == null) {
            System.out.println("Unable Remove");
            return;
        }
        if(l == 0){
            removeAtFirst();
            return;
        }
        Node temp = head;
        while(temp.next != head && l > 1){
            temp = temp.next;
            l--;
        }
        if(l == 1 && temp.next != head){
            temp.next = temp.next.next;
            return;
        }
        System.out.println("Unable to Remove");
    }
    boolean search(int i){
        if(head == null)
            return false;
        if(head.data == i)
            return true;
        Node temp = head.next;
        while(temp != head){
            if(temp.data == i)
                return true;
            temp = temp.next;
        }
        return false;
    }
    void removeAtLast(){
        if(head == null){
            System.out.println("UnderFlow");
            return;
        }
        if(head.next == head){
            head = null;
            return;
        }
        if(head.next.next == head){
            head.next = head;
            return;
        }
        Node temp = head;
        while(temp.next.next != head)
            temp = temp.next;
        temp.next = head;
    }
    void removeAtFirst(){
        if(head == null){
            System.out.println("UnderFlow");
            return;
        }
        if(head.next == head){
            head = null;
            return;
        }
        Node temp = head;
        head = head.next;
        Node temp1 = head;
        while(temp1.next != temp)
            temp1 = temp1.next;
        temp1.next = head;
    }

    void insertionAtFirst(int i) {
        Node n = new Node(i);
        if(head == null){
            head = n;
            n.next = head;
            return;
        }
        Node temp = head;
        n.next = head;
        Node temp1 = n.next;
        while(temp1.next != temp)
            temp1 = temp1.next;
        temp1.next = n;
        head = n;
    }
    void insertionAtLast(int x){
        Node n = new Node(x);
        if(head == null){
            head = n;
            n.next = head;
            return;
        }
        Node temp = head;
        while(temp.next != head)
            temp = temp.next;
        temp.next = n;
        n.next = head;
    }

    void display(){
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
}
