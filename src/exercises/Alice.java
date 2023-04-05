package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting " +
                "by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'".toLowerCase();
        Scanner input = new Scanner(System.in);
        System.out.println("Search phrase or term? ");
        String phrase = input.nextLine().toLowerCase();
        input.close();
        Boolean found = sentence.contains(phrase);
        if (found) {
            System.out.println("The phrase '" + phrase + "' was found.");
        } else {
            System.out.println("The phrase '" + phrase + "' was not found.");
        }
    }
}
