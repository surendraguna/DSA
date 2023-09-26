package Practice;
import LinkedList.*;

import java.util.Scanner;

public class NthNodeFromLastNode {
    static LL.Node head = null;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LL l = new LL();
        int a = 1;
        while(a != 0){
            a = s.nextInt();
            switch (a){
                case 1 -> l.addLast(s.nextInt());
                case 2 -> l.display();
                case 3 -> head = LL.read();
                case 4 -> head = fromLastNode(head, s.nextInt());
                case 5 -> l.display(head);
            }
        }
    }
    static LL.Node fromLastNode(LL.Node head, int n){
        if(head == null){
            return null;
        }
        LL.Node slow = head;
        LL.Node fast = head;
        while(n > 0){
            fast = fast.next;
            n--;
        }
        /*while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;*/
        return recur(slow, fast);
    }
    // Recursive approach
    static LL.Node recur(LL.Node slow, LL.Node fast){
        if(fast == null){
            return slow;
        }
        return recur(slow.next, fast.next);
    }
}
