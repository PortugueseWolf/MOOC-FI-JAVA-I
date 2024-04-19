
// Import Scanner
import java.util.Scanner;

public class SimpleCalculator {

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

        // Calculate the sum, difference, product and quocient
        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product =firstNumber * secondNumber;
        double quocient = 1.0 * firstNumber / secondNumber;

        // Print results
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + difference);
        System.out.println(firstNumber + " * " + secondNumber + " = " + product);
        System.out.println(firstNumber + " / " + secondNumber + " = " + quocient);

        // Close scanner
        scanner.close();
    }
}
