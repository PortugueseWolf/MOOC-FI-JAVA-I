
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Greet the user, and ask how he's doing
        System.out.println("Greetings! How are you doing?");

        // Commit user input to a String variable
        String input = scanner.nextLine();

        // Print first response
        System.out.println("Oh, how interesting. Tell me more!");

        // Commit user input
        input = scanner.nextLine();

        // Print second response
        System.out.println("Thanks for sharing!");

        // Close scanner
        scanner.close();
    }
}
