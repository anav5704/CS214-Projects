class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
