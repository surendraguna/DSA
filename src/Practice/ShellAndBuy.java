package Practice;

public class ShellAndBuy {
    public static void main(String[] args) {
        int a[] = {6, 7, 1, 4, 2, 3, 5, 1};
        int min = a[0];
        int max = 0;
        for(int i = 1; i < a.length; i++){
            if(min > a[i])
                min = a[i];
            else if(a[i] - min > max)
                max = a[i] - min;
        }
        System.out.println(max);
    }
}
