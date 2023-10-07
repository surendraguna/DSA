package Practice;

public class Rotate2D {
    public static void main(String[] args) {
        // Brute Force Approach
        // Time Complexity: O(n^2)
        // Space Complexity: O(n^2)
        int[][] a = new int[4][];
        a = new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
            };
        /*int[][] b = new int[3][3];
        int m = 2;
        for(int i = 0; i < a.length; i++){
            int n = 0;
            for(int j = 0; j < a[i].length; j++) {
                b[n++][m] = a[i][j];
            }
            m--;
        }
        for(int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }*/
        // Inplace Approach
        // Time Complexity: O(n^2)
        // Space Complexity: O(1)
        for(int i = 0; i < a.length - 1; i++){
            for(int j = i + 1; j < a[0].length; j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length / 2; j++){
                int temp = a[i][j];
                a[i][j] = a[i][a[0].length - 1 - j];
                a[i][a[0].length - 1 - j] = temp;
            }
        }
        for(int[] c : a){
            for(int d : c)
                System.out.print(d + " ");
            System.out.println();
        }
    }
}
