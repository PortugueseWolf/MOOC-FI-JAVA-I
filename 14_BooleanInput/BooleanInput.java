
// Import Scanner
import java.util.Scanner;


public class BooleanInput {
    
    public static void main (String[] args) {

        // Declare Scanner
        Scanner scanner = new Scanner(System.in);

        // Ask user for Boolean value
        System.out.println("Write something:");

        // Declare reply has a boolean variable (true or false, if nothign but TRUE it will be false)
        boolean input = Boolean.valueOf(scanner.nextLine());

        // Print reply
        System.out.println("You wrote " + input);

        // Close scanner
        scanner.close();
    
    }
}
