
// Import Scanner
import java.util.Scanner;

public class PrintThrice {

    public static void main (String[] args) {
        // Set up scanner
        Scanner scanner = new Scanner(System.in);

        // Ask user for input then save as a string var
        System.out.println("Give a word:");
        String input = scanner.nextLine();

        // Close scanner
        scanner.close();

        // Loop 3 times
        for (int i = 0; i < 3; i++)
        System.out.print(input);
    }
}
