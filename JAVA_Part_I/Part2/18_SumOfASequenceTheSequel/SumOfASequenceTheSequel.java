
// Import Scanner
import java.util.Scanner;

public class SumOfASequenceTheSequel {
    public static void main (String[] args) {
        // Declare the scanner
        Scanner scanner = new Scanner(System.in);

        // Ask user for the first number
        System.out.println("First number?");

        // Delcare user input as an Integer
        int firstNumber = Integer.valueOf(scanner.nextLine());

        // Ask user for the second number
        System.out.println("second number?");

        // Declare user input as an Integer
        int secondNumber = Integer.valueOf(scanner.nextLine());

        // Close the scanner
        scanner.close();

        // Declare an Integer varible to sum the numbers
        int sum = 0;

        // Loop to make the sum
        while (firstNumber <= secondNumber) {
            // Sum
            sum += firstNumber;

            // Increase the number
            firstNumber ++;
        }
        // Print the sum
        System.out.println("The sum is: " + sum);
    }
}
