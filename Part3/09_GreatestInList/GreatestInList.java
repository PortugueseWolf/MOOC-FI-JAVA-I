
// Import Scanner & ArrayList
import java.util.Scanner;
import java.util.ArrayList;

public class GreatestInList {
    public static void main (String[] args) {
        // Set up scanner
        Scanner scanner = new Scanner(System.in);

        // Create a new list
        ArrayList<Integer> list = new ArrayList<>();

        // Loop until user inputs -1
        while (true) {
            // Set user input as an integer
            int input = Integer.valueOf(scanner.nextLine());

            // Check if -1 was given
            if (input == -1) {
                // Close scanner
                scanner.close();

                // End loop
                break;
            }
            // add input to the list
            list.add(input);
        }
        // Create the greatest int variable to print after finding wich of the given numbers was the biggest
        int greatest = 0;

        // Loop to see all numbers in list
        for (int number : list) {
            // Check if bigger
            if (number > greatest) {
                // Set has the greatest
                greatest = number;
            }
        }

        // Return
        System.out.println("The greatest number: " + greatest);
    }    
}
