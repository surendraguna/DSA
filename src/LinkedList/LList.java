package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LList {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(7);
        l.add(4);
        l.add(5);
        System.out.println(l);
        for(int i = l.size(); i > 0; i--){
            System.out.print(l.get(i-1) + " ");
        }
        System.out.println();
        Collections.sort(l);
        System.out.println(l);
    }
}
