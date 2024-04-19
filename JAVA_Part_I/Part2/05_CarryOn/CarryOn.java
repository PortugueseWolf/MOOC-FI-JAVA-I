
// Import Scanner
import java.util.Scanner;

public class CarryOn {
    
    public static void main (String[] args) {

        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Loop asking user if program is to carry on until input is no
        while (true) {
            // Ask user if program carries on
            System.out.println("Shall we carry on?");

            // Declare user answer as a String named input
            String input = scanner.nextLine();

            // Check if answer was "no"
            if (input.equals("no")) {
                break;
            }
        }
        // scanner is no longer needed
        scanner.close();
    }
}
