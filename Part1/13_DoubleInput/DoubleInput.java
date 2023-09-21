
// Import Scanner
import java.util.Scanner;

public class DoubleInput {
    
    public static void main (String[] args) {

        // Declaring the scanner
        Scanner scanner = new Scanner(System.in);

        // Ask user for floating-point
        System.out.println("Give a number:");

        // Declare user input has a Double variable
        double number = Double.valueOf(scanner.nextLine());

        // Print reply
        System.out.println("You gave the number " + number);

        //close scanner
        scanner.close();

    }

}
