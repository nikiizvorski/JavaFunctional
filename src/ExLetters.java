/**
 * Created by nikiizvorski on 14/04/2017.
 */
import java.util.HashMap;
import java.util.Map;

public class ExLetters {

    private static Map<Character, Integer> letters = new HashMap<>();

    public static void main(String[] args) {
        letters.put('A', 1);
        letters.put('B', 3);
        letters.put('C', 3);
        letters.put('D', 2);
        letters.put('E', 1);
        letters.put('F', 4);
        letters.put('G', 2);
        letters.put('H', 4);
        letters.put('I', 1);
        letters.put('J', 8);
        letters.put('K', 5);
        letters.put('L', 1);
        letters.put('M', 3);
        letters.put('N', 1);
        letters.put('O', 1);
        letters.put('P', 3);
        letters.put('Q', 10);
        letters.put('R', 1);
        letters.put('S', 1);
        letters.put('T', 1);
        letters.put('U', 1);
        letters.put('V', 4);
        letters.put('W', 4);
        letters.put('X', 8);
        letters.put('Y', 4);
        letters.put('Z', 10);

        int score = calculateScore("Thomas");

        System.out.println("score for name Thomas is " + score);
        System.out.println("Press any key to exit");

        System.console().readLine();
    }

    private static int calculateScore(String input) {
        // The score
        int score = 0;
        char[] charArray = input.toUpperCase().toCharArray();

        for (Character key : letters.keySet()) {
            score = letters.get(key);
            if ((new String(charArray).contains("" + key))) {
                System.out.println(""+key);
            }
        }

        System.out.println(charArray);

        return score;
    }
}
