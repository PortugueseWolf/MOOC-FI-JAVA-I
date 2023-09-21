
// Import Scanner
import java.util.Scanner;

public class FromWhereToWhere {
    public static void main (String[] args) {

        // Declare scanner
        Scanner scanner = new Scanner(System.in);

        // Ask user for ending point
        System.out.println("Where to?");

        // Declare user input as an Integer
        int endPoint = Integer.valueOf(scanner.nextLine());

        // Ask user for starting point
        System.out.println("Where from? ");

        // Declare user input as an Integer
        int startPoint = Integer.valueOf(scanner.nextLine());

        // Close the scanner
        scanner.close();
        
        // Check if start point is smaller than end point to start the loop
        if (startPoint < endPoint) {
            // Loop
            while (startPoint <= endPoint) {
                System.out.println(startPoint);
                startPoint ++;
            }
        }
    }
}
