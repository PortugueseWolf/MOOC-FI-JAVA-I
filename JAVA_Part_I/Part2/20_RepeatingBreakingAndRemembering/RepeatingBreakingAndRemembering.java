
// Import Scanner
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {
    public static void main (String[] args) {
        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Declare an Integer to keep track of the sum
        int sum = 0;

        // Declare an Integer to keep track of the count
        int count = 0;

        // Declare an Integer to keep track of the even numbers
        int even = 0;

        // Declare an Integer to keep track of the odd numbers
        int odd = 0;

        // Loop to receive numbers until user inputs -1
        while (true) {
            // Ask user for numbers
            System.out.println("Give numbers:");

            // Declare user input as an Integer
            int number = Integer.valueOf(scanner.nextLine());

            // Check if input was -1
            if (number == -1) {
                // Print goodby
                System.out.println("Thx! Bye!");

                // Print sum
                System.out.println("Sum: " + sum);

                // Print count of numbers
                System.out.println("Numbers: " + count);

                // Calculate the average
                double average = 1.0 * sum / count;

                // Print the average
                System.out.println("Average: " + average);

                // Print the count of even numbers
                System.out.println("Even: " + even);

                // Print the count of odd numbers
                System.out.println("Odd: " + odd);

                //end program
                break;
            } else if (number % 2 == 0) {
                // sum
                sum += number;

                // count
                count ++;

                // add to the even numbers count
                even ++;
            } else {
                // sum
                sum += number;

                // count
                count ++;

                // add to the odd numbers count
                odd ++;
            }
        }
        // Close scanner
        scanner.close();
    }
}
