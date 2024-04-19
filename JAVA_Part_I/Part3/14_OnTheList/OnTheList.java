
// Import Scanner & >ArrayList
import java.util.Scanner;
import java.util.ArrayList;

public class OnTheList {

    public static void main (String[] args) {
        // Set up scanner & create new ArrayList
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        // Loop to receive input until empty string
        while (true) {
            // Set user input as a String
            String input = scanner.nextLine();

            // Check if input = empty string ("")
            if (input.equals("")) {
                // Stop loop
                break;
            }
            // Add input to the list
            list.add(input);
        }
        // Ask user wich string to search for & and set his answer as a string
        System.out.println("Search for?");
        String search = scanner.nextLine();

        // Close scanner
        scanner.close();

        // Create an int var to keep track if search value was found or not (=0 not, >0 found)
        int found = 0;

        // Loop through the list to find string
        for (String name : list) {
            // See if the same
            if (name.equals(search)) {
                // Add to found int
                found ++;
            }
        }
        // See if it was found or not then print accordingly
        if (found > 0) {
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found!");
        }
    }
}
