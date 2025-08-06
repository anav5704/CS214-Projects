package priorityQueue;

import java.util.PriorityQueue;
// import java.util.Comparator; (Inline comparator implementation)

public class Main {
    public static void main(String[] args) {
        // (Inline comparator implementation)
        // Comparator<Student> gpa = (a, b) -> b.gpa.compareTo(a.gpa);

        PriorityQueue<Student> studentPQ = new PriorityQueue<Student>();

        studentPQ.add(new Student("John", 4.1));
        studentPQ.add(new Student("Mark", 4.5));
        studentPQ.add(new Student("Dave", 4.3));
        studentPQ.add(new Student("Ronn", 4.5));
        studentPQ.add(new Student("Ruby", 3.5));
        studentPQ.add(new Student("Fred", 4.4));
        studentPQ.add(new Student("Sera", 4.2));

        int awardees = 0;

        while (!studentPQ.isEmpty() && awardees < 5) {
            Student s = studentPQ.poll();

            if (s.getGpa() > 4.0) {
                System.out.println(s);
                awardees++;
            }
        }
    }
}
