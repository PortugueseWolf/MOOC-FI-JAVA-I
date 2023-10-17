
// Import Scanner & ArrayList
import java.util.Scanner;
import java.util.ArrayList;

public class AverageOfAList {

    public static void main (String[] args) {
        // Set up scanner & create a new list
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // Loop until user gives -1
        while (true) {
            // Set user input as an int & check if it was -1
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                // Stop scanner & loop
                scanner.close();
                break;
            }
            // Add input to the list
            list.add(input);
        }
        // Create int var to sum up all list entries
        int sum = 0;

        // Loop to sum
        for (int number : list) {
            sum += number;
        }

        // Calculate avg
        double average = 1.0 * sum / list.size();

        // Print result
        System.out.println("Average: " + average);
    }
}