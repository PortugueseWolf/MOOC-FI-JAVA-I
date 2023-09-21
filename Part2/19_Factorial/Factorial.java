
// Import Scanner
import java.util.Scanner;

public class Factorial {
    public static void main (String[] args) {
        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Ask user for a number
        System.out.println("Give a number:");

        // Declare user input as an Integer
        int number = Integer.valueOf(scanner.nextLine());

        // Close scanner
        scanner.close();
        
        //Declare an Integer to keep the factorial values
        int factorial = 1;

        // Loop to calculate
        for (int i = 1; i <= number; i++) {
            // Factorial
            factorial *= i;
        }

        // Print factorial
        System.out.println("Factorial: " + factorial);
    }
}