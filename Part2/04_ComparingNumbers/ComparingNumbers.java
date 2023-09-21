
// Import Scanner
import java.util.Scanner;

public class ComparingNumbers {
    
    public static void main (String[] args) {

        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Declare first user input as an Integer named firstNumber
        int firstNumber = Integer.valueOf(scanner.nextLine());

        // Declare second user input as an Integer named secondNumber
        int secondNumber = Integer.valueOf(scanner.nextLine());

        // Scanner is no longer needed
        scanner.close();

        // Calculate first if the numbers are equal then wich is the biggest one
        if (firstNumber == secondNumber) {
            // Print numbers are the same
            System.out.println(firstNumber + " is equal to " + secondNumber + ".");
        } else if (firstNumber > secondNumber) {
            // Print first bigger than second
            System.out.println(firstNumber + " is greater than " + secondNumber + ".");
        } else {
            // Print second bigger than first
            System.out.println(secondNumber + " is greater than " + firstNumber + ".");
        }
    }
}
