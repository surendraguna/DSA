package Practice;

public class KthBitSetOrNot {
    static boolean isKthBitSet(int n, int k) {
        int x = (1 << k);
        System.out.println(Integer.toBinaryString(x) + " " + x);
        return (n & x) == x;
    }
    public static void main(String[] args) {
        int n = 5, k = 2;
        System.out.println(isKthBitSet(n, k));
    }
}
