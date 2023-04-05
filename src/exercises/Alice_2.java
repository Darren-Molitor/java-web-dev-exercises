package exercises;

import java.util.Scanner;

public class Alice_2 {
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
        Integer phraseLength = phrase.length();
        Boolean found = sentence.contains(phrase);
        if (found) {
            Integer phraseIndex = sentence.indexOf(phrase);
            String temp1 = sentence.substring(0, (phraseIndex - 1));
            String temp2 = sentence.substring((phraseIndex + phraseLength), sentence.length());
            String newSentence = temp1.concat(temp2);
            System.out.println("The phrase '" + phrase +
                    "' was found at position " + phraseIndex +
                    " and is " + phraseLength + " characters long.");
            System.out.println(temp1);
            System.out.println(temp2);
            System.out.println(phraseIndex + " " + phraseLength);
            System.out.println(newSentence);
        } else {
            System.out.println("The phrase '" + phrase + "' was not found.");
        }
    }
}
