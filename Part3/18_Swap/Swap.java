
// Import Scanner
import java.util.Scanner;

public class Swap {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        // Ask for the the indices
        System.out.println("Give two indeces to swap:");

        // Set answer with integers & close the scanner
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());
        scanner.close();

        // Save the value of the second index
        int valueOfSecond = array[second];

        // Change the values
        array[second] = array[first];
        array[first] = valueOfSecond;

        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }  
    }
}
