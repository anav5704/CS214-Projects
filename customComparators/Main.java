import java.util.Comparator;
import java.util.Arrays;

// Named class
// class Asc implements Comparator<Person> {
//     public int compare(Person a, Person b) {
//         return a.age.compareTo(b.age);
//     }
// }

public class Main {
    public static void main(String[] args) {
        // Lambda expression
        Comparator<Person> asc = (a, b) -> a.age.compareTo(b.age);

        // Anonymous inner class
        // Comparator<Person> asc = new Comparator<Person>() {
        //     public int compare(Person a, Person b) {
        //         return a.age.compareTo(b.age);
        //     }
        // };

        // Comparator chaining
        // Comparator<Person> asc = Comparator.comparing(Person::getAge).thenComparing(Person::getName);

        Person[] people = {
            new Person("Kevin", 15),
            new Person("John", 15),
            new Person("Emily", 16)
        };

        Arrays.sort(people, asc);

        for(Person person: people) {
            System.out.println(person);
        }
    }
}
