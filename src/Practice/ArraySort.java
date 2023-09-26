package Practice;

import java.util.Scanner;

public class ArraySort{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = s.nextInt();
        if(sortedOrNot(a, a.length))
            System.out.println("Array is Sorted");
        else
            Sort(a);
        for(int i : a)
            System.out.println(i);
    }

    private static void Sort(int[] a) {
        // Insertion sort
        /*for(int  i = 1; i < a.length; i++)
        {
            int key = a[i];
            int j = i - 1;
            while(j >= 0 && a[j] > key)
            {
                a[j + 1] = a[j];
                j--;
            }
            a[j +  1] = key;
        }*/
        // bubble sort
        /*for(int i = 0; i < a.length; i++)
            for(int j = i + 1; j < a.length; j++)
            {
                if(a[i] > a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
         */
        // selection sort
        for(int i = 0; i < a.length; i++)
        {
            int min = i;
            for(int j = i + 1; j < a.length; j++)
            {
                if(a[j] < a[min])
                {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }

    }

    static boolean sortedOrNot(int a[], int n){
        if(n == 1) // it is reached to element first element
            return true;
        return a[n - 1] >= a[n - 2] && sortedOrNot(a, n - 1); // to verify sortedOrNot and check further elements
        // (a[n - 1] > a[n - 2]) ? 0 : sortedOrNot(a, n - 1);
    }
}
