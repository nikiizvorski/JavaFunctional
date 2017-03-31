import java.util.function.BiConsumer;

/**
 * Created by nikiizvorski on 31/03/2017.
 *
 * BiConsumer represents an operation that accepts two input arguments and returns no result.
 *
 */
public class ExBiConsumer {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
            Person person = new Person("Niki", " Izvorski", 24);
            BiConsumer<String, String> biConsumer = (s, s2) -> {
                System.out.print(s);
                System.out.print(s2);
            };

            biConsumer.accept(person.getFirstname(), person.getLastname());
    }
}
