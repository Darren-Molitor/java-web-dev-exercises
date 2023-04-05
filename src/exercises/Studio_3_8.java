package exercises;
import java.util.HashMap;
import java.util.Map;
//import java.util.Scanner;
public class Studio_3_8 {
    public static void main(String[] args) {
        // define & initialize the string with the quote
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms " +
                "has to be zero to start with. So if you move all the terms over to one side, you can put the " +
                "quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = quote.toCharArray();     // convert quote to a character array
        HashMap<Character, Integer> characters = new HashMap<>();     // define HashMap
        Integer count = 0;     // initialize counter

        // loop thru array
        for (char letter : charactersInString) {
            // count = letter.getValue() + 1;
            characters.put(letter, count);
            }
//        for (Integer sum : characters.values()) {
//            sum += 1;
//            characters.put(letter, sum);
//            System.out.println(sum);
//        }
    }
}
