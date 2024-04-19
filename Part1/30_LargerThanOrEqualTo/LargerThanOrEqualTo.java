
// Import Scanner
import java.util.Scanner;

public class LargerThanOrEqualTo {
    
    public static void main (String[] args) {

        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Ask user for the first number
        System.out.println("Give the first number:");

        // Declare user input as an Integer named firstNumber
        int firstNumber = Integer.valueOf(scanner.nextLine());

        // Ask user for the second number
        System.out.println("Give the second number:");

        // Declare user input as an Integer named secondNumber
        int secondNumber = Integer.valueOf(scanner.nextLine());

        // With an if statement see wich number is the bigger or if the numbers are equal
        if (firstNumber == secondNumber) {
            // The numbers are equal
            System.out.println("The numbers are equal!");
        } else if (firstNumber > secondNumber) {
            // first number is bigger than the second
            System.out.println("Greather number is: " + firstNumber);
        } else {
            // Second number is the biggest
            System.out.println("Greather number is: " + secondNumber);
        }

        // Close scanner
        scanner.close();
    }
}
