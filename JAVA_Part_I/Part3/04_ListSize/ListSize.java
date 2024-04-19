
// Import Scanner then ArrayList
import java.util.Scanner;
import java.util.ArrayList;

public class ListSize {
    public static void main (String[] args) {
        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Create a new ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Loop till empty string is given ("")
        while (true) {
            // Store user input as a String
            String input= scanner.nextLine();

            // Check if empty String was given
            if (input.equals("")) {
                // Close scanner
                scanner.close();
                // Exit loop
                break;
            }

            // Add input to the list
            list.add(input);
        }
        // Print how many words in list
        System.out.println("In total: " + list.size());
    }
}
