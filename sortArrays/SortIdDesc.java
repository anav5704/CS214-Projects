import java.util.Comparator;

class SortIdDesc implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s2.getId() - s1.getId();
    }
}
