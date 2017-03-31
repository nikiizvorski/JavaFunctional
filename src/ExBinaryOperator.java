import java.util.function.BinaryOperator;

/**
 * Created by nikiizvorski on 31/03/2017.
 *
 * BinaryOperator represents an operation upon two operands of the same type, producing a result of the same type.
 */
public class ExBinaryOperator {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Person person = new Person("Niki", " Izvorski", 24);
        eX(person);
    }

    /**
     * The entry point of application.
     *
     * @param person the input arguments
     */
    private static void eX(Person person) {
        BinaryOperator<String> stringBinaryOperator = (s, s2) -> s + s2;
        System.out.println(stringBinaryOperator.apply(person.getFirstname(), person.getLastname()));
    }
}
