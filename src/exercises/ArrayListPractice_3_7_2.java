package exercises;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListPractice_3_7_2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        // populate ArrayList with numbers 1 - 10.  ** Total = 30 **
        numbers.add(1);numbers.add(2);numbers.add(3);numbers.add(4);numbers.add(5);
        numbers.add(6);numbers.add(7);numbers.add(8);numbers.add(9);numbers.add(10);
        System.out.println(sumEven(numbers));

        ArrayList<String> words = new ArrayList<>();
        // populate the ArrayList with words.  ** words of length 5 = 6 **
        words.add("cat");words.add("dog");words.add("black");
        words.add("planet");words.add("Earth");words.add("green");
        words.add("knick");words.add("knack");words.add("human");
        words.add("at");words.add("yellow");words.add("four");
        words.add("five");words.add("seven");words.add("possible");
        System.out.println(wordCount(words));
    }
    public static int sumEven(ArrayList<Integer> numbers) {
        int total = 0;
        for (int integer : numbers) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
    public static int wordCount(ArrayList<String> words) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();

        int num = 0;
        for (String word : words) {
            if (word.length() == numChars) {
                num += 1;
            }
        }
        input.close();
        return num;
    }
}
