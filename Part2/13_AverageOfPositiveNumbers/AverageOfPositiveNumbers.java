
// Import Scanner
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main (String[] args) {

        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Declare an Integer to count how many positive numbers where given
        int count = 0;

        // Declare an Integer to sum the positive numbers given
        int sum = 0;

        // Loop until 0 is given
        while (true) {
            // Declare user input as an Integer
            int number = Integer.valueOf(scanner.nextLine());

            // check if end condition was given and positive numbers were given
            if (number == 0 && count > 0) {
                // Calculate the average
                double average = 1.0 * sum / count;

                // Print average
                System.out.println(average);
                
                // end loop
                break;
            } else if (number == 0){
                // Print that the program can't calculate
                System.out.println("Cannot calculate the average");
                
                // End Loop
                break;

            } else if (number > 0) {
                // Count
                count ++;
                
                // Sum
                sum += number;
            } else {
                // Do nothing
                continue;
            }
        }
        // scanner no longer needed
        scanner.close();
    }
}