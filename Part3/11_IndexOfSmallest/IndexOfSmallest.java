
// Import Scanner & ArrayList
import java.util.Scanner;
import java.util.ArrayList;

public class IndexOfSmallest {
    
    public static void main (String[] args) {
        // Set up scanner
        Scanner scanner = new Scanner(System.in);
        
        // Create an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        
        // Loop to receive user input until 9999 is given
        while (true) {
            // Set input as an int
            int input = Integer.valueOf(scanner.nextLine());
            
            // Check if end loop is true
            if (input == 9999) {
                // Stop scanner & loop
                scanner.close();
                break;
            }
            // Add input to list
            list.add(input);
        }
        // Create an int to keep track of smallest
        int smallest = list.get(0);
        // Loop to find smallest
        for (int number : list) {
            if (number < smallest) {
                // Set as smallest
                smallest = number;
            }
        }
        // Print wich is smallest
        System.out.println("Smallest number: " + smallest);

        // Loop to find smallest indexes
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
