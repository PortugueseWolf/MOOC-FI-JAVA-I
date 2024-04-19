
// Import Scanner
import java.util.Scanner;

public class Ancient {
    
    public static void main (String[] args) {

        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Ask user for a year
        System.out.println("Give a year:");

        // Save the answer has a Integer variable
        int year = Integer.valueOf(scanner.nextLine());

        // If statement to check is year given is smaller than 2015
        if (year < 2015) {
            // Print ancient
            System.out.println("Ancient history!");
        }

        // Close scanner
        scanner.close();
    }
}
