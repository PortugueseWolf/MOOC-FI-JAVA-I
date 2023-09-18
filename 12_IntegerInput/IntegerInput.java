// Import Scanner
import java.util.Scanner;

public class IntegerInput {
    
    public static void main (String[] args) {
        // Declaring scanner
        Scanner scanner = new Scanner(System.in);

        // Ask user for a number
        System.out.println("Give a number:");

        // Save answer as a Integer
        int number = Integer.valueOf(scanner.nextLine());

        // Print reply
        System.out.println("You gave the number " + number);

        // Close scanner
        scanner.close();
    }
}
