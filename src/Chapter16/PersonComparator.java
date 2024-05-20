package Chapter16;

import Chapter15.Person;

import java.util.Comparator;

public class PersonComparator  implements Comparator<Person> {
    @Override
    public int compare(Person first, Person second){
        return second.getName().compareTo(first.getName());
    }
}
