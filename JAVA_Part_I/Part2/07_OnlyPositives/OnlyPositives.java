
// Import Scanner
import java.util.Scanner;

public class OnlyPositives {
    
    public static void main (String[] args) {

        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Loop until user input is 0
        while (true) {
            // Ask user for a number
            System.out.println("Give a number:");

            // Declare input as an Integer named number
            int number = Integer.valueOf(scanner.nextLine());

            // Check what input was
            if (number == 0) {
                break;
            } else if (number > 0) {
                // calculate power of two
                int result = number * number;
                System.out.println(result);
            } else {
                System.out.println("Unsuitable number");
            }
        }
        // Scanner no longer needed
        scanner.close();
    }
}
