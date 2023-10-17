package MapPractice;

import java.util.*;

public class RemoveDupli {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 1, 2, 3, 4, 1, 2};
        Map<Integer, Integer> m = new HashMap<>();
        for(int i : a){
            if(m.containsKey(i))
                m.put(i, m.get(i) + 1);
            else
                m.put(i, 1);
        }
        /*Set<Map.Entry<Integer, Integer>> s = m.entrySet();
        for(Map.Entry<Integer, Integer> i : s)
            System.out.println(i.getKey() + " " + i.getValue());*/

        Set s = m.keySet();
        for(Object i : s)
            System.out.print(i + " ");
        System.out.println();
        Collection c = m.values();
        for(Object i : c)
            System.out.print(i + " ");
        System.out.println();
        m.forEach((k, v) -> System.out.println(k + " " + v));

        for(int i = 0;  i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
        Set<Integer> d = new HashSet<>();
        for(int i : a)
            d.add(i);
        System.out.println(d);
    }
}
