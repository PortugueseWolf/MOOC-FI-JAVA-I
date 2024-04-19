
// Import Scanner
import java.util.Scanner;

public class SumOfASequence {
    public static void main (String[] args) {
        
        // Declare the scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for a number
        System.out.println("Last number?");

        // Declare the user input as an Integer
        int number = Integer.valueOf(scanner.nextLine());

        // Close the scanner
        scanner.close();

        // Declare an Integer variable to keep track of the sum
        int sum = 0;

        // Loop until number is reached
        for (int i = 1; i <= number; i++) {
            // sum
            sum += i;
        }

        // Print the sum
        System.out.println("The sum is " + sum);
    }
}
