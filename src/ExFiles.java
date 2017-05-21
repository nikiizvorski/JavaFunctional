import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by nikiizvorski on 01/04/2017.
 *
 * BinaryOperator represents an operation upon two operands of the same type, producing a result of the same type.
 *
 */
public class ExFiles {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws IOException the io exception
     */
    public static void main(String[] args) throws IOException {
        findLongestLengthOfLine();
        findLongestLineInFile();
        findallwordswithSameLetter("niki");
        findAnagramwordInFile("words");
    }

    /**
     *
     * Print Result of anagram word in the file
     *
     * @throws IOException the io exception
     */
    private static void findAnagramwordInFile(String niki) throws IOException {
        Path path = Paths.get("words.txt");
        List<String> words = Files.lines(path)
                .sorted().filter(s -> Arrays.equals(s.chars().sorted().toArray(), niki.chars().sorted().toArray()))
                .collect(Collectors.toList());

        System.out.println(words);
    }

    /**
     *
     * Print Result of word that is contained in a line
     *
     * @throws IOException the io exception
     */
    private static void findallwordswithSameLetter(String word) throws IOException {
        Path path = Paths.get("words.txt");
        List<String> words = Files.lines(path)
                .filter(s -> s.contains(word))
                .collect(Collectors.toList());

        System.out.println(words);
    }

    /**
     *
     * Using BinaryOperator as accumulator
     * with reduce method to save partial result of longest line
     * and print the result
     *
     * @throws IOException the io exception
     */
    private static void findLongestLineInFile() throws IOException {
        Path path = Paths.get("words.txt");
        String longestLine = Files.lines(path)
                .reduce((s, s2) -> {
                    if (s.length() > s2.length())
                        return s;
                    return s2;
                }).get();

        System.out.println("Actual longest line: " + longestLine);
    }

    /**
     *
     * Print Result mapping to Int to avoid AutoBoxing and UnBoxing
     * truly amazing methods
     *
     * @throws IOException the io exception
     */
    private static void findLongestLengthOfLine() throws IOException {
        Path path = Paths.get("words.txt");
        int longestLine = Files.lines(path)
                .mapToInt(String::length)
                .max()
                .getAsInt();

        System.out.println("Longest Length in file: " + longestLine);
    }
}
