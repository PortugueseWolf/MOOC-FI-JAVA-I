
// Import Scanner
import java.util.Scanner;

public class Squared {
    
    public static void main (String[] args) {

        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Declare user input as an Integer named number
        int number = Integer.valueOf(scanner.nextLine());

        // Close scanner
        scanner.close();

        // Calculate square of number (number * number)
        int squared = number * number;

        // Print result
        System.out.println(squared);
    }
}
