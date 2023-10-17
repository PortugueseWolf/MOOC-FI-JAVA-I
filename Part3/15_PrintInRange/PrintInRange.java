
// Import ArrayList
import java.util.ArrayList;

public class PrintInRange {

    public static void main (String[] args) {
        // Create new array list
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);

System.out.println("The numbers in the range [0, 5]");
printNumbersInRange(numbers, 0, 5);
    }

    public static void printNumbersInRange (ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        // Loop through the list
        for (int number : numbers) {
            // Check if within range
            if (number >= lowerLimit && number <= upperLimit) {
                // Print
                System.out.println(number);
            }
        }
    }
}
