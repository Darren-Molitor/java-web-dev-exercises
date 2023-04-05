package exercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashMap_3_7_3 {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();   // Define / initialize HashMap
        Scanner input = new Scanner(System.in);   // Initialize Scanner input
        String newName = "";
        System.out.println("Enter students' info (or ENTER to finish):");   // Instructions
        do {
            System.out.print("Name: ");
            newName = input.nextLine();   // Get Name input after Enter


            if (!newName.equals("")) {
                System.out.print("Student ID number: ");
                Integer newID = input.nextInt();   // Get ID number input after Enter
                students.put(newID, newName);   // Populate HashMap with ID, Name
                input.nextLine();   // Prepare to read next input
            }

        } while(!newName.equals(""));   // Control test for While condition

        // Print Roster Output to the Console.
        System.out.println("\nClass Roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue());
        }
    }
}
