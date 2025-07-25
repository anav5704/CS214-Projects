import java.util.Comparator;

class SortIdAsc implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.getId() - s2.getId();
    }
}
