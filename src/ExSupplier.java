import java.util.function.Supplier;

/**
 * Created by nikiizvorski on 01/04/2017.
 *
 * Supplier represents a supplier of results.
 */
public class ExSupplier {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Supplier<String> i  = ()-> "niki";

        System.out.println(i.get());

        System.out.println(maker(() -> new Person("Niki","Izvorski",24)));
    }

    /**
     *
     * @param supplier
     * @return a result
     */
    private static Person maker(Supplier<Person> supplier) {
        return supplier.get();
    }
}
