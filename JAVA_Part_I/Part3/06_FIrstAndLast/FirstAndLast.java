
// Import Scanner and ArrayList
import java.util.Scanner;
import java.util.ArrayList;

public class FirstAndLast {

    public static void main (String[] args) {
        // Implement the scanner
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Loop until user inputs an empty string ("")
        while (true) {
            // Set input has a String variable
            String input = scanner.nextLine();

            // Check if end condition is met
            if (input.equals("")) {
                // Close scanner
                scanner.close();

                // End loop
                break;
            }
            // Add input to the list
            list.add(input);
        }
        // Find last index
        int lastIndex = list.size() - 1;

        // Print first and last
        System.out.println(list.get(0));
        System.out.println(list.get(lastIndex));
    }
}
