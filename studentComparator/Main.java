package studentComparator;

import studentComparator.Student;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Comparator<Student> gpaAsc = (a, b) -> Double.compare(a.gpa, b.gpa);
        Comparator<Student> gpaDesc = (a, b) -> Double.compare(b.gpa, a.gpa);
        Comparator<Student> nameAsc = (a, b) -> a.name.compareTo(b.name);
        Comparator<Student> nameDesc = (a, b) -> b.name.compareTo(a.name);

        PriorityQueue<Student> studentPQ = new PriorityQueue<Student>(gpaDesc);

        Student s1 = new Student("Mike", "S1", 4.5);
        Student s2 = new Student("Edward", "S2", 2.5);
        Student s3 = new Student("Joe", "S3", 3.5);
        
        studentPQ.add(s1);
        studentPQ.add(s2);
        studentPQ.add(s3);

        while(!studentPQ.isEmpty()) {
            System.out.println(studentPQ.remove());
        }
    }
}
