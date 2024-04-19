
// Import Scanner
import java.util.Scanner;

public class NumberOfNegativeNumbers {
    
    public static void main (String[] args) {
        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Declare an Integer to count how many negative numbers where given to the program
        int count = 0;
        // Loop until input is 0
        while (true) {
            // Ask user for input
            System.out.println("Give a number:");

            // Declare input as an Integer named number
            int number = Integer.valueOf(scanner.nextLine());

            // Check if input was 0
            if (number == 0) {
                // Print count of negative numbers
                System.out.println("Number of negative numbers: " + count);
                break;
            } else if (number < 0) {
                // Increase count
                count ++;
            } else {
                // Do nothing
                continue;
            }
        }
        // Scanner is no longer needed
        scanner.close();
    }
}
