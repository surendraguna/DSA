package Conversations;

public class Conversations {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toOctalString(a));
        System.out.println(Integer.toString(a));
        System.out.println(Integer.toHexString(a));
        String s = "   My is name Surendra   hi    ";
        // Display word by word
        // Trim to remove leading and trailing spaces
        // Split is used to return char Array
        String[] w = s.trim().split("\\s+");
        for(String i : w)
            System.out.println(i);
        s = "";
        for(int j = w.length - 1; j > -1; j--) {
            s = s + w[j];
            s = s + " ";
        }
        System.out.println(s);
    }
}
