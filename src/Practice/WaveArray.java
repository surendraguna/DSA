package Practice;

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int a[] = {2, 4, 7, 5,1};
        Arrays.sort(a);
        for(int i = 0; i < a.length - 1; i += 2){
            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
        }
        for(int n : a){
            System.out.print(n + " ");
        }
    }
}
