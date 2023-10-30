package Practice;

import java.util.ArrayList;
import java.util.List;

class Student{
    String name;
    int age;
    List<String> course;
    Student(String n, int a, List<String> c){
        name = n;
        age = a;
        course = c;
    }

    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }

    List<String> getCourse(){
        return course;
    }

}
public class StudentManagement {
    public static void main(String[] args) {
        List<Student> s = new ArrayList<>();
        s.add(new Student("Surendra", 19, List.of("DSA", "DAA", "DBMS", "DWDM")));
        s.add(new Student("Guna", 20, List.of("DSA1", "DAA1", "DBMS1", "DWDM1")));
        s.add(new Student("Boya", 21, List.of("DSA2", "DAA2", "DBMS2", "DWDM2")));
        for(Student a : s){
            if(a.getAge() > 20)
                System.out.println(a.getName() + " " + a.getAge() + " " + a.getCourse());
        }
    }
}
