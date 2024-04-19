
// Import Scanner & ArrayList
import java.util.Scanner;
import java.util.ArrayList;

public class RememberTheseNumbers {
    public static void main (String[] args) {
        // Assign scanner
        Scanner scanner = new Scanner(System.in);

        // Create new List
        ArrayList<Integer> list = new ArrayList<>();

        // Loop until -1 is given´
        while (true) {
            // Assign input to an Integer variable
            int input = Integer.valueOf(scanner.nextLine());

            // Check if end loop was given (-1)
            if (input == -1) {
                // Close scanner
                scanner.close();

                // Stop loop
                break;
            }
            // Add number to the list
            list.add(input);
        }
        // Loop to print all numbers on the list
        for (int number : list) {
            System.out.println(number);
        }
    }
}
