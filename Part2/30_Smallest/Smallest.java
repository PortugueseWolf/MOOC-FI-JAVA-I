
public class Smallest {
    public static void main (String [] args) {
        int answer = smallest(2, 7);
        System.out.println(answer);
    }

    // Create the method to find and return the smallest number
    public static int smallest (int number1, int number2) {
        // Declare an Integer to store the smallest
        int smallest = 0;

        // Find the smallest with an if statment
        if (number1 < number2) {
            smallest = number1;
        } else {
            smallest = number2;
        }

        return smallest;
    }
}
