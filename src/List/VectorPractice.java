package List;

 import java.util.Vector;

public class VectorPractice {
    public static void main(String[] args) {
        // Size is Number of elements in the vector
        // Capacity is the number of elements it can hold

        Vector<Vector<Integer>> p = new Vector<>();
        for(int i = 0; i < 5; i++){
            Vector<Integer> t = new Vector<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i)
                    t.add(1);
                else {
                    int value = p.get(i - 1).get(j - 1) + p.get(i - 1).get(j);
                    t.add(value);
                }
            }
            p.add(t);
        }
        for(Vector<Integer> i : p){
            for(int j : i)
                System.out.print(j);
            System.out.println();
        }

    }
}
