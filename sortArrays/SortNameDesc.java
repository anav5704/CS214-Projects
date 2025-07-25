import java.util.Comparator;

class SortNameDesc implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s2.getName().compareTo(s1.getName());
    }
}
