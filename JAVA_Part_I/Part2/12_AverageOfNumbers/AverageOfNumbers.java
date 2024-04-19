
// Import Scanner
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main (String[] args) {

        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Declare an Integer to count how many numbers were given
        int count = 0;

        // Declare an Intege to sum the numbers given
        int sum = 0;

        // Loop until user inputs 0
        while (true)  {
            // Ask user for a number
            System.out.println("Give a number:");

            // Declare user input as an Integer
            int number = Integer.valueOf(scanner.nextLine());

            // Check if input was 0
            if (number == 0) {
                // Calculate the average (1.0 * sum / count)
                double average = 1.0 * sum / count;
                
                // Print the average
                System.out.println("Average of the numbers: " + average);

                // break the loop
                break;
            }

            // Add 1 to the count
            count ++;

            // Sum the number
            sum += number;
        }
        // scanner is no longer needed
        scanner.close();
    }
}