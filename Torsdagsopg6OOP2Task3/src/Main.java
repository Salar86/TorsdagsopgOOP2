import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        Person s1 = new Student("Preben");
        Person s2 = new Student("Hussein", "Java 1.0");
        Person t1 = new Teacher("Merete");
        Person t2 = new Teacher("Flemming", "Java 1.0");
        ArrayList<Person> persons = new ArrayList<>();
        /* for (Person p: persons) {
            persons.add(p);
        }*/

        persons.add(s1);
        persons.add(s2);
        persons.add(t1);
        persons.add(t2);
        for (Person p: persons) {
            p.addCourse("Java 1.0");

        }
        System.out.println(persons);

    }
}
