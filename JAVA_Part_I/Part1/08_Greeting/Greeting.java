
import java.util.Scanner;

public class Greeting {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here

        // Ask user name
        System.out.println("What's your name?");

        // Commit to memory input as a String variable
        String input = scanner.nextLine();

        // print program response
        System.out.println("Hi " + input);

        //close scanner
        scanner.close();
    }
}
