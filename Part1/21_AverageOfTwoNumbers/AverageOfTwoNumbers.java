
// Import Scanner
import java.util.Scanner;

public class AverageOfTwoNumbers {
    
    public static void main (String[] args) {

        // Declare scanner
        Scanner scanner = new Scanner(System.in);


        // Ask user for the first number
        System.out.println("Give the first number:");

        // Declare user input as an Integer
        int firstNumber = Integer.valueOf(scanner.nextLine());

        // Ask user for the second number
        System.out.println("Give the second number:");

        // Declare user input as an Integer
        int secondNumber = Integer.valueOf(scanner.nextLine());

        // Calculate the answer
        double average = 1.0 * (firstNumber + secondNumber) / 2;

        // Print the result
        System.out.println("The average is " + average);

        // Close scanner
        scanner.close();
    }
}
