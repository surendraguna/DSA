package Practice;

import java.util.*;

public class Triangle
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = 5;
        int a[][] = new int[n][n];
        int i, j;
        for(i = 0; i < n; i++)
        {
            a[i][0] = 1;
            for(j = 1; j < i; j++) {
                a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
            }
            a[i][i] = 1;
        }
        for(i = 0; i < n; i++)
        {
            for(j = 0; j <= i; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    /*public static List<List<Integer>> pascalTriangle(int n) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                int value = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                row.add(value);
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> pascal = pascalTriangle(numRows);

        for (List<Integer> row : pascal) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }*/
}

