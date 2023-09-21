
// Import Scanner
import java.util.Scanner;

public class AbsoluteValue {
    
    public static void main (String[] args) {

        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Declare user input as an Integer named number
        int number = Integer.valueOf(scanner.nextLine());

        // Scanner is no longer needed
        scanner.close();

        // Check if Integer given is less than zero
        if (number < 0) {
            // Calculate number multiplied by negative one (-1) with an Integer named result
            int result = number * -1;

            // Print result
            System.out.println(result);
        } else {
            // Print number
            System.out.println(number);
        }
    }
}
