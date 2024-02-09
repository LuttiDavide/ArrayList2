import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Alice", 20));
        studentList.add(new Student("Bob", 22));
        studentList.add(new Student("Carol", 21));
        studentList.add(new Student("David", 23));

        System.out.println("Lista di studenti non ordinata : ");
        for (Student student : studentList) {
            System.out.println("Nome : " + student.getName() + ", Età : " + student.getAge());
        }

        Collections.sort(studentList, (s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()));

        System.out.println("\nLista degli studenti in ordine per età : " );
        for (Student student : studentList) {
            System.out.println("Nome : " + student.getName() + ", Età : " + student.getAge());
        }
    }
}