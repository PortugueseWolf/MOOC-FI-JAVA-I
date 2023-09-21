
// Import Scanner
import java.util.Scanner;

public class FromOneToParameter {
    public static void main (String[] args) {
        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Close scanner
        scanner.close();

        // Invoke method
        printUntilNumber(2);
    }

    public static void printUntilNumber (int number) {
        // Loop to print number of times
        for (int i = 1; i <= number; i++) {
            // Print i
            System.out.println(i);
        }
    }
}