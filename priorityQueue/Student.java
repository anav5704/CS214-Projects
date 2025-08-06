package priorityQueue;

class Student implements Comparable<Student> {
    public String name;
    public Double gpa; 

    public Student(String name, Double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    @Override 
    public int compareTo(Student other) {
        return other.gpa.compareTo(gpa);
    }

    @Override
    public String toString() {
        return "Name: " + name + " gpa: " + gpa;
    }


}

