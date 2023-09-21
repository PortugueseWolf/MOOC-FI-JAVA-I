
// Import Scanner
import java.util.Scanner;

public class OddOrEven {
    
    public static void main (String[] args) {

        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Ask user for a number
        System.out.println("Give a number:");

        // Declare number given as an Integer named number
        int number = Integer.valueOf(scanner.nextLine());

        // Use 'if' statement to see if the remainder of the division of said number is zero (if true then number is even)
        if (number % 2 == 0) {
            // Number is even
            System.out.println("Number " + number + " is even.");
        } else {
            // Number is odd
            System.out.println("Number " + number + " is odd.");
        }

        // Close scanner
        scanner.close();
    }
}
