package priorityQueue;

/// class Student implements Comparable<Student> { (Student class implementation)
class Student implements Comparable { // (Generic object implementation)
    private String name;
    private Double gpa;

    public Student(String name, Double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public Double getGpa() {
        return gpa;
    }

    // @Override (Student class implementation)
    // public int compareTo(Student s) {
    // return s.gpa.compareTo(gpa);
    // }

    @Override // (Generic object implementation)
    public int compareTo(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj; // Downcast

            return s.gpa.compareTo(gpa);
        } else {
            throw new ClassCastException();
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + " gpa: " + gpa;
    }
}