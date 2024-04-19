
// Import Scanner then ArrayList
import java.util.Scanner;
import java.util.ArrayList;

public class LastInList {
    public static void main (String[] args) {
        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Loop until user given an empty string
        while (true) {
            // Set user input as a String variable
            String input = scanner.nextLine();

            // Check if an empty string was give
            if (input.equals("")) {
                // Close the scanner
                scanner.close();

                // End loop
                break;
            }
            // Add input to the list
            list.add(input);
        }
        // Check last index
        int lastIndex = list.size() - 1;
        // Print last give word
        System.out.println(list.get(lastIndex));
    }
}
