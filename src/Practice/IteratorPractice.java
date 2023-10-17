package Practice;

import java.util.*;

public class IteratorPractice {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(null);
        Enumeration<Integer> e = v.elements();
        while(e.hasMoreElements())
            System.out.print(e.nextElement() + " ");
        System.out.println();
        Integer z[] = {1, 2, 3, 4, 5};
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(z));
        Iterator<Integer> i = a.iterator();
        while (i.hasNext())
            System.out.print(i.next() + " ");
        System.out.println();
        i.remove();
        System.out.println(a);
    }
}
