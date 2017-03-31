import java.util.function.Consumer;

/**
 * Created by nikiizvorski on 31/03/2017.
 *
 * Consumer interface represents an operation that accepts a single input argument and returns no result.
 */
public class ExConsumer {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Person person = new Person("Niki", " Izvorski", 24);

        firstEx(person);
        secondEx(person);
    }

    /**
     * Print Results of the Consumer
     *
     * @param person the input arguments
     *
     * Here the Compiler helps you for adding this in front of last since it is
     * being final and being accessed between anonymous class!
     */
    private static void secondEx(Person person) {
        String last = person.getLastname();
        Consumer<String> consumer = (String s) -> {
            System.out.print(s);
            System.out.print(last);
        };
        consumer.accept(person.getFirstname());
    }

    /**
     * Print Results of consumer
     *
     * @param person the input arguments
     */
    private static void firstEx(Person person) {
        Consumer<String> consumer = System.out::println;
        consumer.accept(person.getFirstname() + person.getLastname());
    }
}
