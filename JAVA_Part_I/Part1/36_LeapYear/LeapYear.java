
// Import Scanner
import java.util.Scanner;

public class LeapYear  {

    public static void main (String[] args) {

        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Ask user for a year
        System.out.println("Give a year:");

        // Declare user input as an Integer named year
        int year = Integer.valueOf(scanner.nextLine());

        // With an 'if' statement check if it is a leap year or not
        if (year % 100 == 0 && year % 400 == 0 || year % 4 == 0 && !(year % 100 == 0)) {
            // It a leap year
            System.out.println("The year is a leap year.");
        } else {
            // It's not a leap year
            System.out.println("The year is not a leap year.");
        }
        // Close scanner
        scanner.close();
    }
}
