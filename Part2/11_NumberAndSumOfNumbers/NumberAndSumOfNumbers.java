
// Import Scanner
import java.util.Scanner;

public class NumberAndSumOfNumbers {
    
    public static void main (String[] args) {

        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Declare an Integer variable to count numbers given
        int count = 0;
        
        // Declare an Integer variable to sum the numbers given
        int sum = 0;

        // Loop until user inputs 0
        while (true) {
            // Ask user for a number
            System.out.println("Give a number:");

            // Declare user input as an Integer
            int number = Integer.valueOf(scanner.nextLine());

            // Check if number given was 0
            if (number == 0) {
                // Print count
                System.out.println("Number of numbers: " + count);
                System.out.println("Sum of the numbers: " + sum);

                // end loop
                break;
            }
            // Count
            count ++;

            // Sum
            sum += number;
        }
        // scanner no longer needed
        scanner.close();
    }
}
