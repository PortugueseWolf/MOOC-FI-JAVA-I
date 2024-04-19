
// Import Scanner & ArrayList
import java.util.Scanner;
import java.util.ArrayList;

public class OnlyTheseNumbers {
    public static void main (String[] args) {
        // Set up scanner
        Scanner scanner = new Scanner(System.in);

        // Create new List
        ArrayList<Integer> list = new ArrayList<>();

        // Loop until user inputs -1
        while (true) {
            // Set up user input as an integer variable
            int input = Integer.valueOf(scanner.nextLine());

            // Check if -1 was given
            if (input == -1) {
                // End loop
                break;
            }
            // Add input to the list
            list.add(input);
        }
        // Ask user the index to start from
        System.out.println("From where?");

        // Save answer
        int from = Integer.valueOf(scanner.nextLine());

        // Ask user the index where it ends
        System.out.println("To where?");

        // Save answer
        int to = Integer.valueOf(scanner.nextLine());

        // Close scanner
        scanner.close();

        // Loop to print requested indexes
        for (int i = from; i <= to; i++) {
            System.out.println(list.get(i));
        }
    }
}
