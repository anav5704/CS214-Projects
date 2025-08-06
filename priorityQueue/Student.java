package priorityQueue;

class Student {
    public String name;
    public Double gpa; 

    public Student(String name, Double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Name: " + name + " gpa: " + gpa;
    }
}

