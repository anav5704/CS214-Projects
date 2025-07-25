import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
            new Student(1, "Anav"),
            new Student(2, "John"),
            new Student(3, "Fred"),
        };

        Arrays.sort(students, new SortIdAsc());

        for(Student student: students) {
            student.displayInfo();
        }

        Arrays.sort(students, new SortIdDesc());

        for(Student student: students) {
            student.displayInfo();
        }

        Arrays.sort(students, new SortNameAsc());

        for(Student student: students) {
            student.displayInfo();
        }

        Arrays.sort(students, new SortNameDesc());

        for(Student student: students) {
            student.displayInfo();
        }
    }
}
