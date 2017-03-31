import java.util.function.IntFunction;

/**
 * Created by nikiizvorski on 30/03/2017.
 * <p>
 * We can use a method reference when creating a recursive lambda expressions.
 */
public class ExRecursion {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        IntFunction<Long> factorialCalc = ExRecursion::factorial;
        System.out.println(factorialCalc.apply(10));
    }

    /**
     * Factorial long.
     *
     * @param n the n
     * @return the long
     */
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}

