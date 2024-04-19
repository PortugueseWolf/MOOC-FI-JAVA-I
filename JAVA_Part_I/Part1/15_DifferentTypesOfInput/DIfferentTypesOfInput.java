
// Import scanner
import java.util.Scanner;

public class DifferentTypesOfInput {
    
    public static void main (String[] args) {

        // Declare the scanner
        Scanner scanner = new Scanner(System.in);

        // Ask user for a String
        System.out.println("Give a string:");
        
        // Declare input as a String
        String text = scanner.nextLine();

        // Ask user for a Integer
        System.out.println("Give an integer:");
        
        // Declare input as a Integer
        int number = Integer.valueOf(scanner.nextLine());

        // Ask user for a Double
        System.out.println("Give a double:");
        
        // Declare input as a Double
        double floatingPoint = Double.valueOf(scanner.nextLine());

        // Ask user for a Boolean
        System.out.println("Give a boolean:");
        
        // Declare input as a Integer
        boolean trueOrFalse = Boolean.valueOf(scanner.nextLine());

        // Print the reply
        System.out.println("You gave the string " + text + "\n" +
                            "You gave the integer " + number + "\n" +
                            "You gave the double " + floatingPoint + "\n" +
                            "You gave the boolean " + trueOrFalse + "\n");

        // Close scanner
        scanner.close();
    }
}
