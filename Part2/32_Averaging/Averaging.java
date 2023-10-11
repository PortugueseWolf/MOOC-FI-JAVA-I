
public class Averaging {
    public static void main (String[] args) {
        double answer = average(1, 3, 5, 7);
        System.out.println(answer);
    }

    // Create method to calculate and return the average of given numbers
    public static double average (int number1, int number2, int number3, int number4) {
        // Declare a Integer variable to store the sum of the numbers
        int sum = number1 + number2 + number3 + number4;

        // Declare a Integer with the amount of numbers given (in this case it's always 4)
        int count = 4;

        // Calculate the average with a double variable
        double average = 1.0 * sum / count;

        // Return the average
        return average;
    } 
}
