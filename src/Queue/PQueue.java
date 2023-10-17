package Queue;

import java.util.PriorityQueue;

public class PQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(1);
        q.offer(2);
        q.offer(0);
        System.out.println(q);

        for(Integer i : q)
            System.out.print(i + " ");
        System.out.println();
        for(int i = 65; i < 91; i++){
            System.out.print((char)i + " ");
        }
    }
}
