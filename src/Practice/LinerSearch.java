package Practice;

import java.util.Scanner;

public class LinerSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[] = {5, 4, 2, 1, 3, 6, 9, 8, 7};
        int mid = a.length / 2;
        int set = 0;
        int find = s.nextInt();
        while(((mid - set) >= 0) && ((mid +  set) < a.length)){
            if(a[mid - set] == find){
                System.out.println(mid - set + " " + find);
                break;
            }
            else if(a[mid + set] == find){
                System.out.println(mid + set + " " + find);
                break;
            }
            set ++;
        }
    }
}
