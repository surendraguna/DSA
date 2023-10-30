public class MultiDiamenstionArray{
    public static void main(String[] args) {
        int a[][] = new int[3][];
        a = new int[][] {{1, 2, 3, 4, 5}, {4, 5, 6, 10, 11}, {7, 8, 9}};
        System.out.println(a.length);
        System.out.println(a[0].length);
        System.out.println(a[1].length);
        System.out.println(a[2].length);
        for(int[] n : a){
            for(int b : n){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}