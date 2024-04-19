
// Import Scanner
import java.util.Scanner;

public class NumberOfNumbers {
    
    public static void main (String[] args) {

        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Declare an Integer named count, which will count how many numbers were given to the program by the user
        int count = 0;

        // Loop until input is 0
        while (true) {
            // Ask user for input
            System.out.println("Give a number:");

            // Declare input as an integer named number
            int number = Integer.valueOf(scanner.nextLine());

            // Check if number given is 0
            if (number == 0) {
                // Print how many numbers where given until but not included zero
                System.out.println("Number of numbers: " + count);
                break;
            }
            // increase the count
            count ++;
        }
        // Scanner no longer needed
        scanner.close();
    }
}
