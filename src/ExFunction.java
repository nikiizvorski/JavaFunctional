import java.util.function.Function;

/**
 * Created by nikiizvorski on 31/03/2017.
 * <p>
 * Function represents a function that accepts one argument and produces a result.
 */
public class ExFunction {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Person person = new Person("Niki", " Izvorski", 24);
        firstEx(person);
        thirdEx(person);
    }

    /**
     * Print results
     *
     * @param person the input arguments
     */
    private static void thirdEx(Person person) {
        String res = doIt(integer -> "" + (integer * person.getAge()), 2);
        System.out.println(res);
    }

    /**
     * Do it string.
     *
     * @param bi the bi
     * @param i  the
     * @return the string
     */
    public static String doIt(Function<Integer, String> bi, Integer i) {
        return bi.apply(i);
    }

    /**
     * Print results
     *
     * @param person the input arguments
     */
    private static void firstEx(Person person) {
        Function<Integer, String> function = Object::toString;
        System.out.println(function.apply(person.getAge()));
    }
}
