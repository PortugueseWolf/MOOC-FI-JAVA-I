
// Import Scanner & ArrayList
import java.util.Scanner;
import java.util.ArrayList;

public class SumOfAList {
    public static void main (String[] args) {
        // Set up scanner & create new ArrayList
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // Loop to get input until -1
        while (true) {
            // Set input as an int & check if input was -1
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                // Close scanner & end loop
                scanner.close();
                break;
            }
            // Add input to list
            list.add(input);
        }
        // Create an int to sum all the list entries
        int sum = 0;

        // Loop true the list to add all values
        for (int number : list) {
            sum += number;
        }
        // Print result
        System.out.println("Sum: " + sum);
    }
}
