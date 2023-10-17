package Practice;

public class FlowOfExecution {
    static {
        System.out.println("Static");
    }
    {
        System.out.println("Non Static");
    }
    FlowOfExecution(){
        this("Default Constructor");
    }
    FlowOfExecution(String c){
        System.out.println(c);
    }
    FlowOfExecution(int n){
        System.out.println("I am Number");
    }

    public static void main(String[] args) {
        FlowOfExecution f = new FlowOfExecution();
        FlowOfExecution g = new FlowOfExecution(5);
    }
}
