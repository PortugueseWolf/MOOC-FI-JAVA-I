
// Import Scanner
import java.util.Scanner;   

public class CheckingTheAge {
    
    public static void main (String[] args) {

        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Ask user his age
        System.out.println("How old are you?");

        // Declare user input as an Integer named age
        int age = Integer.valueOf(scanner.nextLine());

        // Check with an 'if' statement if true
        if (age > -1 && age < 121) {
            // Possible
            System.out.println("OK");
        } else {
            // Impossible
            System.out.println("Impossible!");
        }
        // Close scanner
        scanner.close();
    }
}
