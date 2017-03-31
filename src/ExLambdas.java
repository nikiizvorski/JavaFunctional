import java.util.function.Function;

/**
 * Created by nikiizvorski on 30/03/2017.
 * <p>
 * A lambda expression does not define a scope of its own.
 * If we use keywords this and super in lambda expression inside a method, they act the same as we use them in that method.
 * A lambda expression can access final local variables or local-non-final-initialized-only-once variables.
 */
public class ExLambdas {
    /**
     * The X.
     */
    static String x = "I got them all";

    /**
     * The entry point of application.
     *
     * @param argv the input arguments
     */
    public static void main(String[] argv) {
        Person person = new Person("Niki", " Izvorski", 24);
        firstEx(person);
        secondEx(person);
        thirdEx(person);
    }

    /**
     * Print Results
     *
     * @param person the input arguments
     */
    private static void secondEx(Person person) {
        final String work = "I got them all";
        Function<String,String> func1 = y -> y + " "+ work;
        System.out.println(func1.apply(person.getFirstname() + person.getLastname() + ":"));
    }

    /**
     * Print Results
     *
     * @param person the input arguments
     */
    private static void firstEx(Person person) {
        String work = "I got them all";
        Function<String,String> func1 = y -> y + " " + work;
        System.out.println(func1.apply(person.getFirstname() + person.getLastname() + ":"));
    }

    /**
     * Print Results
     *
     * @param person the input arguments
     */
    private static void thirdEx(Person person) {
        Function<String,String> func1 = y -> {x="you got this";return y + " "+ x ;};
        System.out.println(func1.apply(person.getFirstname() + person.getLastname() + ":"));
    }
}
