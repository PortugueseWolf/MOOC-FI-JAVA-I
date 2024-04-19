
public class SumOfArray {

    public static void main (String[] args) {
        // You can try the method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray (int[] array) {
        // Create an int var to keep track of sum then to return
        int sum = 0;

        // Loop through the array
        for (int number : array) {
            // Sum
            sum += number;
        }

        // Return
        return sum;
    }
}
