package List;

import java.util.Vector;

public class VectorOp {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        // add Operation
        v.add(1);
        System.out.println("v: " + v);
        // addAll operation
        Vector<Integer> v2 = new Vector<Integer>();
        v2.addAll(v);
        v2.add(2);
        System.out.println("v2: " + v2);

        // addElement operation
        v.addElement(3);
        System.out.println("v: " + v);

        // capacity operation
        System.out.println("v capacity:" + v.capacity());

        // clone operation
        Vector<Integer> v3 = (Vector<Integer>)v.clone();
        System.out.println("v3 clone: " + v3);

        // contains operation
        System.out.println("v contains 1: " + v.contains(1));

        // containsAll operation
        System.out.println("v containsAll v2: " + v.containsAll(v2));

        // toArray operation
        Object[] a = v.toArray();
        for(int i = 0; i < a.length; i++)
            System.out.println(a[i]);

        // toString operation
        String s = v.toString();
        System.out.println(s);
        int c = 5;
        System.out.println(~c);
        System.out.println(2 << 2);
        System.out.println(~-9);
        System.out.println(~2);
    }
}
