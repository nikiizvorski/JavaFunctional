import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by nikiizvorski on 30/03/2017.
 * <p>
 * Predicate represents a predicate, which is boolean-valued function, of one argument.
 */
public class ExPredicate {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Person person = new Person("Niki", " Izvorski", 24);
        Person person1 = new Person("Simon", " Fisher", 21);
        Person person2 = new Person("Michael", " Radly", 15);
        Person person3 = new Person("John", " Peter", 27);
        List<Person> personList = Arrays.asList(person, person1, person2, person3);

        getPerson(person);
        getPeople(personList);
        checkPersonAge(person);
        checkAllAges(personList);
        checkNameAges(personList);
    }

    /**
     * Print Results after checks
     *
     * @param personList the input arguments
     */
    private static void checkNameAges(List<Person> personList) {
        Predicate<Person> age = person1 -> person1.getAge() >= 18;
        Predicate<Person> name = person1 -> person1.getFirstname().length() > 6;
        System.out.println("Mature and name: " + personList.stream().filter(age.or(name)).map(Person::getFirstname).collect(Collectors.toList()));
    }

    /**
     * Print Results after checks
     *
     * @param personList the input arguments
     */
    private static void checkAllAges(List<Person> personList) {
        Predicate<Person> age = person1 -> person1.getAge() >= 18;
        System.out.println("Mature ones: " + personList.stream().filter(age).map(Person::getFirstname).collect(Collectors.toList()));
    }

    /**
     * Print Results after checks
     *
     * @param person the input arguments
     */
    private static void checkPersonAge(Person person) {
        Predicate<Person> age = person1 -> person1.getAge() > 18;
        System.out.println("Age: " + age.test(person));
    }

    /**
     * Print Results after checks
     *
     * @param person the input arguments
     */
    private static void getPerson(Person person) {
        Predicate<String> i  = (s)-> s.length() > 4;
        System.out.println("Big Name: " + i.test(person.getFirstname() + person.getLastname()));
    }

    /**
     * Print Results after checks
     *
     * @param personList the input arguments
     */
    private static void getPeople(List<Person> personList) {
        Predicate<Person> name  = person4 -> person4.getFirstname().length() > 5;
        System.out.println("People: " + personList.stream().filter(name).map(Person::getFirstname).collect(Collectors.toList()));
    }

}
