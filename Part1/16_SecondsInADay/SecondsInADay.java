
// Import Scanner
import java.util.Scanner;

public class SecondsInADay {
    
    public static void main (String[] args) {

        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Ask user for a number of days to convert to seconds
        System.out.println("How many days would you like to convert to seconds?");

        // Declare input as an Integer
        int numberOfDays = Integer.valueOf(scanner.nextLine());

        // Calculate seconds in the provided number of days
        int numbeOfSeconds = numberOfDays * 24 * 60 * 60;

        // Print reply
        System.out.println(numbeOfSeconds);

        // Close scanner
        scanner.close();
    }
}
