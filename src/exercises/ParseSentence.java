package exercises;
import java.util.Arrays;
public class ParseSentence {
    public static void main(String[] args) {
        String sentence = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] words = sentence.split(" ");  // Exercise 3.7.1.3
        System.out.println(Arrays.toString(words));  // Exercise 3.7.1.4

        String[] lines = sentence.split("\\.");  // Exercise 3.7.1.5
        System.out.println(Arrays.toString(lines));  // Exercise 3.7.1.4.5
    }
}
