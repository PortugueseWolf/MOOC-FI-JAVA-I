
// Import Scanner
import java.util.Scanner;

public class Same {
    
    public static void main (String[] args) {

        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Ask user for the first String
        System.out.println("Enter the first string:");

        // Declare user input as a String variable named firstString
        String firstString = scanner.nextLine();

        // Ask user for the second String
        System.out.println("Enter the second string:");

        // Declare user input as a String variable named secondString
        String secondString = scanner.nextLine();

        // Check with a 'if' statement if the strings are the same or different
        if (firstString.equals(secondString)) {
            // They're equal
            System.out.println("Same");
        } else {
            // The're different
            System.out.println("Different");
        }
        // Close scanner
        scanner.close();
    }
}
