import java.util.function.Predicate;

/**
 * Created by nikiizvorski on 30/03/2017.
 *
 * Predicate represents a predicate, which is boolean-valued function, of one argument.
 *
 */
public class ExPredicate {

    public static void main(String[] args) {
        Person person = new Person("Niki", " Izvorski", 24);
        Predicate<String> i  = (s)-> s.length() > 5;

        System.out.println(i.test(person.getFirstname() + person.getLastname()));
    }

}
