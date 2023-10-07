package Practice;

import java.util.Scanner;

public class ArrayRotate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = {1, 2, 3, 4, 5};
        int n = s.nextInt();
        n = n % a.length;
        /*for(int i = 0; i < n; i++){
            int last = a[a.length - 1];
            for(int j = a.length - 1; j > 0; j--){
                a[j] = a[j - 1];
            }
            a[0] = last;
        }*/
        rotate(a, n);
        for(int b : a)
            System.out.print(b + " ");
    }
    // Another Method
    static void rotate(int[] a, int k){
        helper(a, 0, a.length - 1);
        helper(a, 0, k - 1);
        helper(a, k, a.length - 1);
    }
    static void helper(int[] a, int s, int e){
        while(s <= e){
            int temp = a[s];
            a[s++] = a[e];
            a[e--] = temp;
        }
    }
}
