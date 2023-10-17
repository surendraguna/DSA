package Queue;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingStack {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 1;
        while(a != 0){
            System.out.println("Enter Option:");
            a = s.nextInt();
            switch (a){
                case 1 -> enQueue(s.nextInt());
                case 2 -> deQueue();
                case 3 -> display();
            }
        }

    }
    static void enQueue(int x){
        s1.push(x);
    }
    static void deQueue(){
        if(s1.isEmpty()) {
            System.out.println("UnderFlow");
            return;
        }
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        if(!s2.isEmpty())
            System.out.println(s2.pop());
        while (!s2.isEmpty())
            s1.push(s2.pop());
    }
    static void display(){
        if(s1.isEmpty()) {
            System.out.println("UnderFlow");
            return;
        }
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        while(!s2.isEmpty())
            System.out.print(s1.push(s2.pop()) + " ");
        System.out.println();
    }
}
