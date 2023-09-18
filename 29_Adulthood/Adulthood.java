
// Import Scanner
import java.util.Scanner;

public class Adulthood {
    
    public static void main (String[] args) {

        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Ask user for his age
        System.out.println("How old are you?");

        // Declare his input has an Integer named age
        int age = Integer.valueOf(scanner.nextLine());

        // Check with an if statement if user is an adult or not (18 or older)
        if (age < 18) {
            // User is underage, print accordingly
            System.out.println("You are not an adult");
        } else {
            // User is an adult, print accordingly
            System.out.println("You are an adult");
        }

        // Close scanner
        scanner.close();
    }
}
