
// Import Scanner
import java.util.Scanner;

public class Orwell {
    
    public static void main (String[] args) {

        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Ask user for a number
        System.out.println("Give a number:");

        // Save input has an Integer variable
        int input = Integer.valueOf(scanner.nextLine());

        // If statement to check if input was 1984
        if (input == 1984) {
            // input was 1984 so print Orwell
            System.out.println("Orwell");
        }

        // Close scanner
        scanner.close();
    }

}
