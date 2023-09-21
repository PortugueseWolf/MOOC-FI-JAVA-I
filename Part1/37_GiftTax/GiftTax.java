
// Import Scanner
import java.util.Scanner;

public class GiftTax {

    public static void main (String[] args) {

        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Ask user for the value of the gift
        System.out.println("Value of the gift?");

        // Declare user input as an Integer named value
        int value = Integer.valueOf(scanner.nextLine());
        
        // Close scanner
        scanner.close();

        // With an 'if' statement check tax due
        // first if gift is tax exempt
        if (value < 5_000) {
            System.out.println("No tax!");

        } else if (value < 25_000) {
            
            // Calculate amount due (5K - 25K)
            double tax = 100 + (value - 5_000) * 0.08;
            // Print tax
            System.out.println("Tax: " + tax);

        } else if (value < 55_000) {

            // Calculate amount due (25K - 55K)
            double tax = 1_700 + (value - 25_000) * 0.1;
            // Print tax
            System.out.println("Tax: " + tax);

        } else if (value < 200_000) {

            // Calculate amount due (55K - 200K)
            double tax = 4_700 + (value - 55_000) * 0.12;
            // Print tax
            System.out.println("Tax: " + tax);

        } else if (value < 1_000_000) {

            // Calculate amount due (200K - 1M)
            double tax = 22_100 + (value - 200_000) * 0.15;
            // Print tax
            System.out.println("Tax: " + tax);
        } else {
            // Only option left is over 1M calculate amount due (over 1M)
            double tax = 142_100 + (value - 1_000_000) * 0.17;
            // Print tax
            System.out.println("Tax: " + tax);
        }
    }
}
