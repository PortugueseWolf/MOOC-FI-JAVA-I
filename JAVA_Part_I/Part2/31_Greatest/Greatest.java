
public class Greatest {
    public static void main (String[] args) {
        int answer = greatest(2, 7, 3);
        System.out.println(answer);
    }

    // Create the method that finds and returns the greatest number of three
    public static int greatest (int number1, int number2, int number3) {
        // Declare an Integer to store the greatest number
        int greatest = 0;

        // Find with an IF statement the greatest number of the three
        if (number1 > number2 && number1 > number3) {
            greatest = number1;
        } else if (number2 > number3) {
            greatest = number2;
        } else {
            greatest = number3;
        }
        // Return greatest
        return greatest;
    }
}
