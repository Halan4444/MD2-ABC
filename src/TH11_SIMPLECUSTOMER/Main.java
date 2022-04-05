package TH11_SIMPLECUSTOMER;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kien", 30, "HT");
        Student student1 = new Student("Nam", 26, "HN");
        Student student2 = new Student("Anh", 38, "HT" );
        Student student3 = new Student("Tung", 38, "HT" );

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        System.out.println("===Sorted by Comparable===");

        Collections.sort(lists);
        for (Student studentElement:lists) {
            System.out.println(studentElement);
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("===Sorted age by Comparator===");
        for (Student studentElement:lists) {
            System.out.println(studentElement);
        }

    }
}
