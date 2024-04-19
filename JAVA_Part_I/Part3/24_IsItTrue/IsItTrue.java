
// Import Scanner
import java.util.Scanner;

public class IsItTrue {
    
    public static void main (String[] args) {
        // Set up scanner
        Scanner scanner = new Scanner(System.in);

        // Ask user for a string and then see if its true
        System.out.println("Give a string:");

        if (scanner.nextLine().equals("true")){
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
        // Close scanner
        scanner.close();
    }
}
