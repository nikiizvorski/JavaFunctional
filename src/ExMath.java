import java.util.OptionalDouble;
import java.util.stream.IntStream;

/**
 * Created by nikiizvorski on 21/05/2017.
 *
 * Just simple math operations for examples
 */
public class ExMath {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        System.out.println("Get me the average from IntStream: ");
        firstExStream(5,6,7,8,3,1,5,3);
        System.out.println();
        System.out.println("Get me the consisting from IntStream: ");
        secondExStream(3,6,3,8,3,8,5,1);
        System.out.println();
        System.out.println("Get me the concat from IntStream: ");
        thirdExStream(IntStream.of(6,5,7,1, 2, 3, 3),IntStream.of(9,8));
    }

    /**
     * IntStream average() returns an OptionalDouble describing
     * the arithmetic mean of elements of this stream, or an empty optional if this stream is empty.
     *
     * @param i
     * @param i1
     * @param i2
     * @param i3
     * @param i4
     * @param i5
     * @param i6
     * @param i7
     */
    private static void firstExStream(int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7) {
        IntStream average = IntStream.of(i,i1,i2,i3,i4,i5,i6,i7);
        OptionalDouble the = average.average();
        if (the.isPresent()){
            System.out.println(the.getAsDouble());
        } else {
            System.out.println("No Values 4 you! xD");
        }
    }

    /**
     * IntStream distinct() returns a stream consisting of the
     * distinct elements of this stream. This is a stateful intermediate operation
     *
     * @param i
     * @param i1
     * @param i2
     * @param i3
     * @param i4
     * @param i5
     * @param i6
     * @param i7
     */
    private static void secondExStream(int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7) {
        IntStream dist = IntStream.of(i,i1,i2,i3,i4,i5,i6,i7);
        dist.distinct().sorted().forEach(System.out::println);
    }

    /**
     *
     * @param intStream
     * @param intStream1
     */
    private static void thirdExStream(IntStream intStream, IntStream intStream1) {
        IntStream con = IntStream.concat(intStream, intStream1);
        IntStream conab = con.map(operand -> -operand );
        System.out.println("Concat Stream Abs: ");
        conab.sorted().forEach(System.out::print);
    }
}
