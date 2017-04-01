import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;

/**
 * Created by nikiizvorski on 01/04/2017.
 *
 * A stream is a sequence of data values supporting sequential and parallel aggregate operations.
 *
 * Important to remember is NxQ which states as big as NxQ is the best results you will get out of the Pipeline
 *
 * Where N - data size and Q is the cost of element
 *
 * Most important thing is STOP thinking about Loops since as soon as you put forEach you are pretty much done with Functional...
 *
 * No More loops for you! :)
 *
 * Avoid as much as possible
 */
public class ExStreams {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Person person = new Person("Niki", "Izvorski", 24);
        Person person1 = new Person("Simon", "Fisher", 21);
        Person person2 = new Person("Michael", "Radly", 15);
        Person person3 = new Person("John", "Peter", 27);
        List<Person> personList = Arrays.asList(person, person1, person2, person3);

        firstStream(personList);
        secondStream(personList);
        thirdStream(personList);
        fourthStream(personList);
        fifthStream(personList);
        sixthStream(personList);
    }

    /**
     * Print result and oldest person
     * @param personList
     */
    private static void sixthStream(List<Person> personList) {
        int allPeopleCount = personList.stream().mapToInt(Person::getAge).max().getAsInt();
        System.out.println("Oldest person: " + allPeopleCount);
    }

    /**
     * Print result and sum all people ages
     * @param personList
     */
    private static void fifthStream(List<Person> personList) {
        long allPeopleCount = personList.stream().mapToInt(Person::getAge).sum();
        System.out.println("Sum of ages: " + allPeopleCount);
    }

    /**
     * Print result and map people count by age
     * @param personList
     */
    private static void fourthStream(List<Person> personList) {
        long allPeopleCount = personList.stream().mapToInt(Person::getAge).count();
        System.out.println("People: " + allPeopleCount);
    }

    /**
     * Print result and map elements from the collection with groupBy
     * @param personList
     */
    private static void thirdStream(List<Person> personList) {
        Map<Integer, String>  namesByGender = personList
                .stream().collect(Collectors.groupingBy(Person::getAge,
                        Collectors.mapping(Person::getFirstname, Collectors.joining(", "))));

        System.out.println(namesByGender);
    }

    /**
     * Print result and avoid using Collection to show then since we need a dash separator
     * @param personList
     */
    private static void secondStream(List<Person> personList) {
        String lastname = personList.stream()
                .map(Person::getLastname)
                .collect(Collectors.joining("-"));
        System.out.println(lastname);
    }

    /**
     * Print result and avoid using Collection to show then since we need a comma separator
     * @param personList
     */
    private static void firstStream(List<Person> personList) {
        String firstNames = personList.stream().map(Person::getFirstname)
                .collect(Collectors.joining(", "));
        System.out.println(firstNames);
    }
}
