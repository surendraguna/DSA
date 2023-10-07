package Practice;

public class SecondMinAndMax {
    public static void main(String[] args) {
        int a[] = {1, 5, 6, 7, 2, 3};
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (min1 > a[i]) {
                min2 = min1;
                min1 = a[i];
            }
            else if (min2 > a[i])
                min2 = a[i];
            if(a[i] > max1){
                max2 = max1;
                max1 = a[i];
            }
            else if(a[i] > max2)
                max2 = max1;
        }
        System.out.println(min1 + " " + min2);

        System.out.println(max1 + " " + max2);
    }
}
