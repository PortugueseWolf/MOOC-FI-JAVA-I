
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

        // Loop until number achieved
        for (int i = 0; i < number; i++) {
            // Invoke method
            printText();
        }
    }

    public static void printText () {
        // Print
        System.out.println("In a hole in the ground there lived a method");
    }
    
}
