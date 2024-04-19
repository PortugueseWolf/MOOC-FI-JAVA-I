
// Import Scanner & Arraylist
import java.util.Scanner;
import java.util.ArrayList;

public class IndexOf {
    public static void main (String[] args) {
        // Set up scanner
        Scanner scanner = new Scanner(System.in);

        // Create a list
        ArrayList<Integer> list = new ArrayList<>();

        // Loop until user gives -1
        while (true)  {
            // Set user input has an Integer
            int input = Integer.valueOf(scanner.nextLine());

            // Check if -1 was given
            if (input == -1) {
                // End loop
                break;
            }
            // Add input to the list
            list.add(input);
        }
        // Ask user for wich number to return the index
        System.out.println("Search for?");

        // Set as an integer
        int search = Integer.valueOf(scanner.nextLine());

        // Close scanner
        scanner.close();

        // Loop to find index
        for (int i = 0; i < list.size(); i++) {
            // Check if it is the search value
            if (list.get(i) == search) {
                // Print answer
                System.out.println(search + " is at index " + i);
            }
        }
    }
}
