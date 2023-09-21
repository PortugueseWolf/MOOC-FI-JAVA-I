
// Import Scanner
import java.util.Scanner;

public class SpeedingTicket {
    
    public static void main (String[] args) {

        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Ask user for speed
        System.out.println("Give speed:");

        // Declare the answer has a Integer named speed
        int speed = Integer.valueOf(scanner.nextLine());

        // With an if statement check if speed given is over the 120 limit
        if (speed > 120) {
            // Print ticket because speed was over 120
            System.out.println("Speeding ticket!");
        }

        // Close scanner
        scanner.close();
    }
}
