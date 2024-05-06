package enumanditerator;

import java.util.*;

public class Employees {
    private List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        employees.add(personToAdd);
    }

    public void add(List<Person> personToAdd) {
        personToAdd.stream()
            .forEach(row -> employees.add(row));
    }

    public void fire(Education education) {
        Iterator<Person> people = employees.iterator();
        
        while (people.hasNext()) {
            if (people.next().getEducation() == education) {
                people.remove();
            }
        }
    }

    public void print() {
        Iterator<Person> people = employees.iterator();
        
        while (people.hasNext()) {
            System.out.println(people.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> people = employees.iterator();

        while (people.hasNext()) {
            Person test = people.next();
            if (test.getEducation() == (education)) {
                System.out.println(test);
            }
        }
    }
}
