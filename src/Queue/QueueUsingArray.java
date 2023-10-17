package Queue;

import java.util.ArrayList;
import java.util.Scanner;

public class QueueUsingArray {
    static ArrayList<Integer> a = new ArrayList<>();
    static void enQueue(int k){
        a.add(k);
    }
    static void deQueue(){
        if(a.size() == 0){
            System.out.println("UnderFlow");
            return;
        }
        a.remove(0);
    }
    static void display(){
        if(a.size() == 0){
            System.out.println("UnderFlow");
            return;
        }
        for(Integer n : a)
            System.out.print(n + " ");
        System.out.println();
    }
    static void peek(){
        if(a.size() == 0){
            System.out.println("Empty");
            return;
        }
        System.out.println(a.get(0));
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 1;
        while(a != 0){
            System.out.println("Enter Option");
            a = s.nextInt();
            switch(a){
                case 1 -> enQueue(s.nextInt());
                case 2 -> deQueue();
                case 3 -> display();
                case 4 -> peek();
            }
        }

    }
}
