
// Import ArrayList
import java.util.ArrayList;

// Import Scanner
import java.util.Scanner;

public class ThirdElement {
    
    public static void main (String[] args) {
        // Declare the scanner
        Scanner scanner = new Scanner(System.in);

        // Create a new ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Loop to receiva all user input until an empty string is given
        while (true) {
            // Set the String variable input has the user input
            String input = scanner.nextLine();

            // Check if the end loop condition was given
            if (input.equals("")) {
                // Close the scanner
                scanner.close();

                // Break loop
                break;
            }

            // Add input to the list
            list.add(input);
        }

        // Print the third element from the list (index 2)
        System.out.println(list.get(2));
    }
}
