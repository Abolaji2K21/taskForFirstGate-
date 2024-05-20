package Chapter16;

import Chapter15.Gender;
import Chapter15.Person;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class Example6 {
    public static void main(String[] args) {
        Set<Person> people = new TreeSet<>();
        people.add(new Person("Buhari", LocalDate.of(2000, 12, 11), "", Gender.SHIM));
        people.add(new Person("Wike", LocalDate.of(1995, 2, 11), "", Gender.SHIM));
        people.add(new Person("Dayo", LocalDate.of(2012, 4, 12), "", Gender.FEMALE));
        people.add(new Person("Bayo", LocalDate.of(2012, 4, 14), "", Gender.FEMALE));
        people.add(new Person("Bolaji", LocalDate.of(1995, 3, 11), "", Gender.MALE));

        System.out.println(people);
    }
}
