
// Import Scanner
import java.util.Scanner;

public class Password {
    
    public static void main (String[] args) {

        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Ask user for password
        System.out.println("Password?");

        // Declare user input as a String named password
        String password = scanner.nextLine();

        // Check with an 'if' statement if password is correct (Caput Draconis)
        if (password.equals("Caput Draconis")) {
            // Right password, print "Welcome!"
            System.out.println("Welcome!");
        } else {
            // Wrong password
            System.out.println("Off with you!");
        }
        // Close scanner
        scanner.close();
    }
}
