import java.util.function.BiPredicate;

/**
 * Created by nikiizvorski on 31/03/2017.
 *
 * BiPredicate represents a predicate which is a boolean-valued function of two arguments.
 */
public class ExBiPredicate {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Person person = new Person("Niki", " Izvorski", 24);
        firstEx(person);
        secondEx(person);
        third(person);
        fourth(person);
        sixth(person);
    }

    /**
     * Print results boolean.
     *
     * @param person the input
     *
     * method accepts what should be happening with the BiPredicate
     * and then you put the actual params on the aggregate operations you perform
     * between the lambda anonymous
     */
    private static void sixth(Person person) {
        boolean b = fifth((s, s2) -> s.length() > s2.length(), person.getFirstname(), person.getLastname());
        System.out.println(b);
    }

    /**
     * Fifth boolean.
     *
     * @param bi the bi
     * @param i1 the 1
     * @param i2 the 2
     * @return the boolean
     */
    public static boolean fifth(BiPredicate<String, String> bi, String i1, String i2) {
        return bi.test(i1, i2);
    }

    /**
     * Print results boolean.
     *
     * @param person the input
     *
     * method accepts what should be happening with the BiPredicate check or()
     * and then you put the actual params on the aggregate operations you perform
     * between the lambda anonymous
     */
    private static void fourth(Person person) {
        BiPredicate<String, String> biPredicate = (s, s2) -> s.length() > s2.length();
        System.out.println(biPredicate.or((s, s2) -> s.contains("i")).test(person.getFirstname(), person.getLastname()));
    }
    /**
     * Print results boolean.
     *
     * @param person the input
     *
     * method accepts what should be happening with the BiPredicate negate logical opposite operation
     * and then you put the actual params on the aggregate operations you perform
     * between the lambda anonymous
     */
    private static void third(Person person) {
        BiPredicate<String, String> biPredicate = (s, s2) -> s.length() > s2.length();
        System.out.println(biPredicate.negate().test(person.getFirstname(), person.getLastname()));
    }

    /**
     * Print results boolean.
     *
     * @param person the input
     *
     */
    private static void secondEx(Person person) {
        BiPredicate<String, String> biPredicate = (s, s2) -> s.length() > s2.length();
        System.out.println(biPredicate.test(person.getFirstname(), person.getLastname()));
    }

    /**
     * Print results boolean.
     *
     * @param person the input
     *
     */
    private static void firstEx(Person person) {
        BiPredicate<String, String> biPredicate = (s, s2) -> s.length() > s2.length();
        System.out.println(biPredicate.test(person.getFirstname(), person.getLastname()));
    }
}
