package Practice;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        ArraySort b = new ArraySort();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = s.nextInt();
        if(ArraySort.sortedOrNot(a, a.length))
            System.out.println("Array Sorted");
        else
            mergeDevide(a, 0, a.length - 1);
        for(int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }
    static void mergeDevide(int[] a, int l, int r)
    {
        if(r > l)
        {
            int m = (l+r)/2;
            mergeDevide(a, l, m); // Left Array
            mergeDevide(a, m+1, r); // Right Array
            mergeConquer(a, l, m, r); // Combine & conquer
        }
    }

    public static void mergeConquer(int[] a, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i = 0; i < n1; i++)// Left array copy
            left[i] = a[l + i];
        for(int j = 0; j < n2; j++) // Right Array Copy
            right[j] = a[m + j + 1];
        int i = 0, j = 0;
        int k = l;
        while(i < n1 && j < n2)
            if(left[i] <= right[j])
                a[k++] = left[i++];
            else
                a[k++] = right[j++];
        while(i < n1)
            a[k++] = left[i++];
        while(j < n2)
            a[k++] = right[j++];
    }
}
