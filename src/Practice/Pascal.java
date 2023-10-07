package Practice;

public class Pascal {
    public static void main(String[] args) {
        int n = 10;
        int[][] a = new int[n][n];
        for(int i = 0; i < a.length; i++){
            a[i][0] = 1;
            for(int j = 1; j < i; j++){
                a[i][j] = a[i-1][j-1] + a[i-1][j];
            }
            a[i][i] = 1;
        }
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
