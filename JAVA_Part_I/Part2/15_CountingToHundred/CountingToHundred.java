
// Import Scanner
import java.util.Scanner;

public class CountingToHundred {
    
    public static void main (String[] args) {

        // Declare scanner
        Scanner scanner = new Scanner((System.in));

        // Declare user input as an Integer
        int number = Integer.valueOf(scanner.nextLine());

        // scanner is no longer needed
        scanner.close();

        // Loop to print for number given to a hundred
        for (int i = number; i <= 100; i++) {
            // Print current number
            System.out.println(i);
        }
    }
}
