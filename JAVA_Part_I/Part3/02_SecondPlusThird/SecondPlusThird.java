
// Import Scanner
import java.util.Scanner;

// Import ArrayList
import java.util.ArrayList;

public class SecondPlusThird {
    public static void main (String[] args) {
        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Loop to get all the user input until 0 is given
        while (true) {
            // Declare the user input has an Integer variable
            int number = Integer.valueOf(scanner.nextLine());

            // Check if the loop end condition was given
            if (number == 0) {
                // Close the scanner
                scanner.close();

                // Break the loop
                break;
            }
            // Add number to the list
            numbers.add(number);
        }
        // Sum the second and third numbers
        int sum = numbers.get(1) + numbers.get(2);

        // Print the result
        System.out.println(sum);
    }
}
