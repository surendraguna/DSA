package Practice;

public class ThresholdLimit {
    public static void main(String[] args) {
        int a[] = {5, 2, 3, 6, 7, 1, 2, 8};
        int threshold = 10;
        for(int i = 0; i < a.length / 2; i++) {
            if (a[i] > threshold) {
                System.out.println(a[i]);
                break;
            } else if (a[a.length - i - 1] > threshold) {
                System.out.println(a[a.length - i - 1]);
                break;
            }
        }
        // Traverse an array from mid to both ends
        // If any element is greater than threshold, print it and break
        int mid = a.length/2;
        int set = 1;
        while(mid - set >= 0 && mid + set < a.length){
            if(a[mid - set] > threshold){
                System.out.println(a[mid - set]);
                break;
            }
            else if(a[mid + set] > threshold){
                System.out.println(a[mid + set]);
                break;
            }
            set++;
        }
    }
}
