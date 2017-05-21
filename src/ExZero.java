import java.util.Arrays;

/**
 * Created by nikiizvorski on 14/04/2017.
 */

public class ExZero {

    public static void main(String[] args) {

        System.out.println("Closest to ExZero");
        System.out.println();

        System.out.println("Problem:");
        System.out.println("Given an array of integers, find the one closest to zero, not including zero itself.");
        System.out.println("If a positive and negative number tie, the positive number should be returned.");
        System.out.println();

        System.out.println("Example:");
        System.out.println("Input: [4, 3, -10, 4, 3, 0, -2, -5, 8]");
        System.out.println("Output: -2");
        System.out.println();

        System.out.println("Tests:");

        int[] testArray = { 4, 3, -10, 4, 3, 0, -2, -5, 8 };
        System.out.println("Your output: " + closestToZero(testArray));

        System.out.println();
        System.out.println("Press any key to close...");
        System.console().readLine();
    }

    /**
     * According to the rules, finds the closest number to zero
     *
     * @param input an array of integer numbers to work on
     * @return the closest number to zero as per the rules
     */
    public static int closestToZero(int[] input) {

        int curr = 0;
        int near = input[0];
        Arrays.sort(input);
        System.out.println("Input: " + Arrays.toString(input));

        for (int i=0; i < input.length; i++){
            System.out.println("Numbers " + input[i] + " = " + Math.abs(0 -input[i]));
            if (input[i] != 0){
                curr = input[i] * input[i];
            } else {
                curr++;
            }

            if (curr <= (near * near)) {
                near = input[i];
            }
        }

        return Math.abs(near);
    }
}
