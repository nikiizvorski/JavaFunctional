import java.util.function.UnaryOperator;

/**
 * Created by nikiizvorski on 01/04/2017.
 *
 * UnaryOperator represents an operation on a single operand that produces a result of the same type as its operand.
 * This is a specialization of Function for the case where the operand and result are of the same type.
 */
public class ExUnaryOperator {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        UnaryOperator<String> i  = (x)-> x.toUpperCase();
        UnaryOperator<Person> operator = person -> new Person("Niki","Izvorski",24);
        System.out.println(i.apply("niki"));
        System.out.println(operator.apply(new Person("","", 0)));
    }
}
