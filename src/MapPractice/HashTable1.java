package MapPractice;

import com.sun.source.doctree.SeeTree;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTable1 {
    public static void main(String[] args) {
        /*Map m = new Hashtable();
        m.put(1, "surya");
        m.put(2, "surendra");
        m.put(3, "SurendraGuna");

        // get Keys
        Set s = m.keySet();
        for(Object i : s)
            System.out.print(i + " ");
        System.out.println();
        System.out.println();
        for(Object i : s)
            System.out.println(m.get(i));
        System.out.println(

        );
        // Get Values
        Collection j = m.values();
        for(Object i : j)
            System.out.print(i + " ");
        System.out.println();
        // Get Entire Table
        s = m.entrySet();
        for(Object i : s)
            System.out.print(i + " ");
        */
        Map<Integer, String> m = new Hashtable<>();
        m.put(1, "surya");
        m.put(2, "surendra");
        m.put(3, "SurendraGuna");
        System.out.println(m);
        m.replace(1, "guna");
        System.out.println(m);
        m.replace(2, "surendra", "surya guna");
        System.out.println(m);
        m.putIfAbsent(3, "surendra");
        System.out.println(m);
        System.out.println(m.size());
        m.forEach((k, v) -> System.out.println(k + " " + v));
        Map<Integer, String> m1 = new Hashtable<>();
        m1.put(1, "surya");
        m1.put(2, "surendra");
        m1.put(3, "SurendraGuna");

        System.out.println(m1.containsKey(1));

        Set<Map.Entry<Integer, String>> s = m1.entrySet();
        for(Map.Entry<Integer, String> i : s)
            System.out.println(i.getKey() + " " + i.getValue());


    }
}
