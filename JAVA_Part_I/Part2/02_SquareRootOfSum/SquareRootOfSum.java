
// Import Scanner
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main (String[] args) {

        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Declare user first input to an Integer named firstNumber
        int firstNumber = Integer.valueOf(scanner.nextLine());

        // Declare user first input to an Integer named secondNumber
        int secondNumber = Integer.valueOf(scanner.nextLine());

        // scanner no longer needed
        scanner.close();
        
        // Sum
        int sum = firstNumber + secondNumber;

        // Calculate square root with math.sqrt
        double squareRoot = Math.sqrt(sum);

        // Print result
        System.out.println(squareRoot);
    }
}