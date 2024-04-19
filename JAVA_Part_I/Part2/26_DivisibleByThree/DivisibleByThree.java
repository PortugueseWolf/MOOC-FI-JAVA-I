
public class DivisibleByThree {
    public static void main (String[] args) {
        // Invoke method
        divisibleByThreeInRange(0, 100);
    }

    // Method to find and print numbers divible by three in a given range
    public static void divisibleByThreeInRange (int beginning, int end) {
        // Loop all numbers in range and print those wich are divisible by three
        for (int i = beginning; i <= end; i++) {
            // Check if it is divible by three
            if (i % 3 == 0) {
                // Print i
                System.out.println(i);
            }
        }
    }
}
