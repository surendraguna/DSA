package Stack;

import java.util.Scanner;
import java.util.Stack;

public class StackC {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack<Integer> a = new Stack<>();
        int c = 1;
        while(c != 0){
            System.out.println("Enter Option:");
            c = s.nextInt();
            switch (c) {
                case 1 -> a.push(s.nextInt());
                case 2 -> a.pop();
                case 3 -> display(a);
            }
        }
    }
    static void display(Stack<Integer> a){
        for(Integer i : a)
            System.out.print(i + " ");
        System.out.println();
    }
}
