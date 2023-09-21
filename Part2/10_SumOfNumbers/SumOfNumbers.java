
// Import Scanner
import java.util.Scanner;

public class SumOfNumbers {

    public static void main (String[] args) {

        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Declare an Integer to keep track of the sum of numbers
        int sum = 0;

        // Loop until user inputs 0
        while (true) {
            // Ask user for a number
            System.out.println("Give a number:");

            // Declare user input as an Integer named number
            int number = Integer.valueOf(scanner.nextLine());

            // Check if input was 0
            if (number == 0) {
                // Print number of negative numbers given
                System.out.println("Sum of the numbers: " + sum);
                break;
            }

            // Use the variable sum to sum
            sum += number;
        }
        // scanner not needed
        scanner.close();
    }
}