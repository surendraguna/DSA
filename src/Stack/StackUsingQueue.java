package Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackUsingQueue {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 1;
        while (a != 0) {
            System.out.println("Enter Option:");
            a = s.nextInt();
            switch (a) {
                case 1 -> push(s.nextInt());
                case 2 -> pop();
                case 3 -> display();
            }
        }
    }

    static void push(int x) {
        q1.add(x);
    }

    static void pop() {
        if (q1.isEmpty()) {
            System.out.println("Underflow");
            return;
        }
        while (q1.size() != 1) {
            q2.add(q1.poll());
        }
        System.out.println(q1.poll());
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    static void display() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (Integer item : q1) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
