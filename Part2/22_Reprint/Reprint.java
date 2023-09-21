
// Import Scanner
import java.util.Scanner;

public class Reprint {
    public static void main (String[] args) {
        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Ask user how many times to print
        System.out.println("How many times?");

        // Declare user input as an Integer
        int number = Integer.valueOf(scanner.nextLine());

        // Close scanner
        scanner.close();

        // Invoke method
        printText(number);
    }

    public static void printText (int number) {
        // Loop for the number of times given
        for (int i = 0; i < number; i++) {
            // Print
            System.out.println("In a hole in the ground there lived  a method");
        }
    }
    
}
