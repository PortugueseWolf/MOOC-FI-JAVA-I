
// Import Scanner
import java.util.Scanner;

public class SumOfThreeNumbers {
    
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

        // Ask user for the third number
        System.out.println("Give the third number:");

        // Declare user input as an Integer
        int thirdNumber = Integer.valueOf(scanner.nextLine());

        // Calculate the answer
        int sum = firstNumber + secondNumber + thirdNumber;

        // Print the result
        System.out.println("The sum of the numbers is " + sum);

        // Close scanner
        scanner.close();
    }
}
