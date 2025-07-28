package studentComparator;

public class Student {
    public String name;
    public String studentId;
    public Double gpa;


    public Student(String name, String studentId, Double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Name: " + name  + " GPA: " + gpa;
    }
}
