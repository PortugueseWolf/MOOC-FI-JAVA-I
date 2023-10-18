
public class Printer {
    
    public static void main (String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars (int[] array) {
            // Loop through array
            for (int number : array) {
                // Loop through the value
                for (int i = 1; i <= number; i++) {
                    //print star
                    System.out.print("*");
                }
                // Print empty line
                System.out.println("");
            }
    }
}
