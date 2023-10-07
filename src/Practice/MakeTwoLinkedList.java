package Practice;

public class MakeTwoLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head = null;
    static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    static void reverseAlternate(Node head){
        Node odd = head;
        Node even = odd.next;
        odd.next = odd.next.next;
        even.next = null;
        odd = odd.next;
        while(odd != null && odd.next != null){
            Node temp = odd.next.next;
            odd.next.next = even;
            even = odd.next;
            odd.next = temp;
            if(temp != null)
                odd = temp;
        }
        odd.next = even;
    }
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next= new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next= new Node(6);
        reverseAlternate(head);
        print(head);
    }
}
