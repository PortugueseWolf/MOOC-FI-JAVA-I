
// Import ArrayList
import java.util.ArrayList;

public class Sum {

    public static void main (String[] args) {
        // Create an array list
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        System.out.println(sum(numbers));

        numbers.add(5);
        numbers.add(1);
        System.out.println(sum(numbers));
    }

    public static int sum (ArrayList<Integer> numbers) {
        // Create an int var to sum
        int sum = 0;

        // Loop through the list
        for (int number : numbers) {
            // Sum
            sum += number;
        }
        // Return
        return sum;
    }
}
