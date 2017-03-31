import java.util.function.BiFunction;

/**
 * Created by nikiizvorski on 31/03/2017.
 *
 * BiFunction represents a function that accepts two arguments and produces a result. This is the two-arity specialization of Function.
 */
public class ExBiFunction {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Person person = new Person("Niki", " Izvorski", 24);

        firstEx(person);

        secondEx(doTheMath((integer, integer2) -> "" + (integer * integer2), 2, 12));
    }

    /**
     * Print results
     *
     * @param x the input arguments
     */
    private static void secondEx(String x) {
        System.out.println(x);
    }

    /**
     * Accept and Print result
     *
     * @param person the input arguments
     */
    private static void firstEx(Person person) {
        BiFunction<String, String, String> func = (s, s2) -> s + s2;
        System.out.println(func.apply(person.getFirstname(), person.getLastname()));
    }

    /**
     * Return a String result from BiFunction
     *
     * @param a1 the input arguments
     * @param a2 the input arguments
     */
    private static String doTheMath(BiFunction<Integer, Integer, String> function, Integer a1, Integer a2){
        return function.apply(a1, a2);
    }
}
