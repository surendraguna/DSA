package Stack;

import java.util.ArrayList;
import java.util.Scanner;

public class StackUsingArray {
    static ArrayList<Integer> a = new ArrayList<>();
    static void push(int k){
        a.add(k);
    }
    static void pop(){
        if(a.size() == 0){
            System.out.println("UnderFLow");
            return;
        }
        a.remove(a.size() - 1);
    }
    static void display(){
        if(a.size() == 0){
            System.out.println("UnderFLow");
            return;
        }
        for(int i = a.size() - 1; i > -1; i--)
            System.out.print(a.get(i) + " ");
        System.out.println();
    }
    static void top(){
        if(a.size() == 0){
            System.out.println("empty");
            return;
        }
        System.out.println(a.get(a.size() - 1));
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 1;
        while (a != 0){
            System.out.println("Enter Option: ");
            a = s.nextInt();
            switch (a){
                case 1 -> push(s.nextInt());
                case 2 -> pop();
                case 3 -> display();
                case 4 -> top();
            }
        }
    }
}
