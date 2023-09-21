
// Import Scanner
import java.util.Scanner;

public class AreWeThereYet {
    
    public static void main (String[] args) {

        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Loop until user input is 4
        while (true) {
            // Ask user for a number
            System.out.println("Give a number:");

            // Declare user input as an Integer named number
            int number = Integer.valueOf(scanner.nextLine());

            // Check if input was 4
            if (number == 4) {
                // Exit loop
                break;
            }
        }
        // scanner is no longer needed
        scanner.close();
    }
}
