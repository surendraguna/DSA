import java.util.Scanner;

public class RecursionBinarySearch {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8 ,9, 10};
        System.out.println(found(a, s.nextInt(), 0, a.length - 1));
    }
    static int found(int a[], int k, int l, int r){
        if(l <= r){
            int mid = (l + r)/2;
            if(a[mid] == k)
                return mid;
            if(a[mid] < k)
                return found(a, k, mid + 1, r);
            else
                return found(a, k, l, mid - 1);
        }
        return -1;
    }
}
