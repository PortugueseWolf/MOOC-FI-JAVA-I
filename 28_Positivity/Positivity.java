
// Import Scanner
import java.util.Scanner;

public class Positivity {
    
    public static void main (String[] args) {

        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Ask user for a number
        System.out.println("Give a number:");

        // Declare number as an Integer
        int number = Integer.valueOf(scanner.nextLine());

        // If statement to see if number is positive or negative
        if (number > 0) {
            // Number is possitive
            System.out.println("The number is positive.");
        } else {
            // Number is negative
            System.out.println("The number is not positive.");
        }

        // Close scanner
        scanner.close();
    }
}
