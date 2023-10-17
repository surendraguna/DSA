package Stack;

import java.util.Scanner;
import java.util.Stack;

public class StackExpression {
    static boolean isValid(String s){
        Stack<Character> a = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '{') {
                a.add('}');
            } else if (s.charAt(i) == '(') {
                a.add(')');
            } else if (s.charAt(i) == '[') {
                a.add(']');
            } else if (s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')') {
                Character b = a.pop();
                if(s.charAt(i) != b)
                    return false;
            }
        }
        if(a.isEmpty())
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = new String(input.next());
        if(isValid(s) == true)
            System.out.println("It is a Valid Statement");
        else System.out.println("Not Valid Statement");
    }
}
