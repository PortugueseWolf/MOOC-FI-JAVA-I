
// Import Scanner
import java.util.Scanner;

public class Counting {

    public static void main (String[] args) {

        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Declare user input as an Integer
        int number = Integer.valueOf(scanner.nextLine());

        // Scanner is no longer needed
        scanner.close();

        // loop until reaches number given starting from 0
        for (int i = 0; i <= number; i++) {
            // Print the count
            System.out.println(i);
        }
    }
}